package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "ResolveEnd")
@js.native
class ResolveEnd protected () extends RouterEvent {
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  urlAfterRedirects: java.lang.String, /** @docsNotRequired */
  state: RouterStateSnapshot) = this()
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  /** @docsNotRequired */
  var urlAfterRedirects: java.lang.String = js.native
}

