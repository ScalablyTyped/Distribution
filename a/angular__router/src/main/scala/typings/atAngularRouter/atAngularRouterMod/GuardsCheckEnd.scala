package typings.atAngularRouter.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "GuardsCheckEnd")
@js.native
class GuardsCheckEnd protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String,
    /** @docsNotRequired */
  state: RouterStateSnapshot,
    /** @docsNotRequired */
  shouldActivate: Boolean
  ) = this()
  /** @docsNotRequired */
  var shouldActivate: Boolean = js.native
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}

