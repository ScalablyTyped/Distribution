package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "GuardsCheckEnd")
@js.native
class GuardsCheckEnd protected () extends RouterEvent {
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  urlAfterRedirects: java.lang.String, /** @docsNotRequired */
  state: RouterStateSnapshot, /** @docsNotRequired */
  shouldActivate: scala.Boolean) = this()
  /** @docsNotRequired */
  var shouldActivate: scala.Boolean = js.native
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  /** @docsNotRequired */
  var urlAfterRedirects: java.lang.String = js.native
}

