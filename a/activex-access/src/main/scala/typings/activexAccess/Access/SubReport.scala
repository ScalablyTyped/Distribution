package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubReport extends js.Object {
  
  @JSName("Access.SubReport_typekey")
  var AccessDotSubReport_typekey: SubReport = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Form: typings.activexAccess.Access.Form = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val Report: typings.activexAccess.Access.Report = js.native
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
  
  @scala.inline
  implicit class SubReportOps[Self <: SubReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessDotSubReport_typekey(value: SubReport): Self = this.set("Access.SubReport_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: Form): Self = this.set("Form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: Report): Self = this.set("Report", value.asInstanceOf[js.Any])
  }
}
