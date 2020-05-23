package typings.activexOffice.anon

import typings.activexOffice.Office.CommandBarButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelDefault extends js.Object {
  var CancelDefault: Boolean
  val Ctrl: CommandBarButton
}

object CancelDefault {
  @scala.inline
  def apply(CancelDefault: Boolean, Ctrl: CommandBarButton): CancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], Ctrl = Ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDefault]
  }
}

