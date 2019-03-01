package typings
package activexDashOfficeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelDefault extends js.Object {
  var CancelDefault: scala.Boolean
  val Ctrl: activexDashOfficeLib.OfficeNs.CommandBarButton
}

object Anon_CancelDefault {
  @scala.inline
  def apply(CancelDefault: scala.Boolean, Ctrl: activexDashOfficeLib.OfficeNs.CommandBarButton): Anon_CancelDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CancelDefault")(CancelDefault)
    __obj.updateDynamic("Ctrl")(Ctrl)
    __obj.asInstanceOf[Anon_CancelDefault]
  }
}

