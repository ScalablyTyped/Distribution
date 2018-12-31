package typings
package atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/url_handling_strategy", "UrlHandlingStrategy")
@js.native
abstract class UrlHandlingStrategy () extends js.Object {
  /**
    * Extracts the part of the URL that should be handled by the router.
    * The rest of the URL will remain untouched.
    */
  def extract(url: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  /**
    * Merges the URL fragment with the rest of the URL.
    */
  def merge(
    newUrlPart: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    rawUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  ): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  /**
    * Tells the router if this URL should be processed.
    *
    * When it returns true, the router will execute the regular navigation.
    * When it returns false, the router will set the router state to an empty state.
    * As a result, all the active components will be destroyed.
    *
    */
  def shouldProcessUrl(url: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree): scala.Boolean = js.native
}

