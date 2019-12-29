package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Screen")
@js.native
class Screen protected () extends js.Object {
  @JSName("Access.Screen_typekey")
  var AccessDotScreen_typekey: Screen = js.native
  val ActiveControl: Control = js.native
  val ActiveDataAccessPage: DataAccessPage = js.native
  val ActiveDatasheet: Form = js.native
  val ActiveForm: Form = js.native
  val ActiveReport: Report = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
  var MousePointer: Double = js.native
  val Parent: js.Any = js.native
  val PreviousControl: Control = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

