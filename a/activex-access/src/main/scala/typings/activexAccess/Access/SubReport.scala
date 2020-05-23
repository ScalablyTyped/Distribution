package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubReport extends js.Object {
  @JSName("Access.SubReport_typekey")
  var AccessDotSubReport_typekey: SubReport
  val Application: typings.activexAccess.Access.Application
  val Form: typings.activexAccess.Access.Form
  val Parent: js.Any
  val Report: typings.activexAccess.Access.Report
  def IsMemberSafe(dispid: Double): Boolean
}

object SubReport {
  @scala.inline
  def apply(
    AccessDotSubReport_typekey: SubReport,
    Application: Application,
    Form: Form,
    IsMemberSafe: Double => Boolean,
    Parent: js.Any,
    Report: Report
  ): SubReport = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Parent = Parent.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SubReport_typekey")(AccessDotSubReport_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubReport]
  }
}

