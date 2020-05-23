package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  @JSName("Access.Screen_typekey")
  var AccessDotScreen_typekey: Screen
  val ActiveControl: Control
  val ActiveDataAccessPage: DataAccessPage
  val ActiveDatasheet: Form
  val ActiveForm: Form
  val ActiveReport: Report
  val Application: typings.activexAccess.Access.Application
  var MousePointer: Double
  val Parent: js.Any
  val PreviousControl: Control
  def IsMemberSafe(dispid: Double): Boolean
}

object Screen {
  @scala.inline
  def apply(
    AccessDotScreen_typekey: Screen,
    ActiveControl: Control,
    ActiveDataAccessPage: DataAccessPage,
    ActiveDatasheet: Form,
    ActiveForm: Form,
    ActiveReport: Report,
    Application: Application,
    IsMemberSafe: Double => Boolean,
    MousePointer: Double,
    Parent: js.Any,
    PreviousControl: Control
  ): Screen = {
    val __obj = js.Dynamic.literal(ActiveControl = ActiveControl.asInstanceOf[js.Any], ActiveDataAccessPage = ActiveDataAccessPage.asInstanceOf[js.Any], ActiveDatasheet = ActiveDatasheet.asInstanceOf[js.Any], ActiveForm = ActiveForm.asInstanceOf[js.Any], ActiveReport = ActiveReport.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), MousePointer = MousePointer.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PreviousControl = PreviousControl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Screen_typekey")(AccessDotScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
}

