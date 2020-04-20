package typings.activexOffice

import typings.activexOffice.Office.CommandBarButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelDefault extends js.Object {
  var CancelDefault: Boolean
  val Ctrl: CommandBarButton
}

object AnonCancelDefault {
  @scala.inline
  def apply(CancelDefault: Boolean, Ctrl: CommandBarButton): AnonCancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], Ctrl = Ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelDefault]
  }
}

