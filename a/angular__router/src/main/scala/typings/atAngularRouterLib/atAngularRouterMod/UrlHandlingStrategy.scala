package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "UrlHandlingStrategy")
@js.native
abstract class UrlHandlingStrategy () extends js.Object {
  /**
    * Extracts the part of the URL that should be handled by the router.
    * The rest of the URL will remain untouched.
    */
  def extract(url: UrlTree): UrlTree = js.native
  /**
    * Merges the URL fragment with the rest of the URL.
    */
  def merge(newUrlPart: UrlTree, rawUrl: UrlTree): UrlTree = js.native
  /**
    * Tells the router if this URL should be processed.
    *
    * When it returns true, the router will execute the regular navigation.
    * When it returns false, the router will set the router state to an empty state.
    * As a result, all the active components will be destroyed.
    *
    */
  def shouldProcessUrl(url: UrlTree): scala.Boolean = js.native
}

