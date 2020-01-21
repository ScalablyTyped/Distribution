package typings.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "NavigationEnd")
@js.native
class NavigationEnd protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String
  ) = this()
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}

