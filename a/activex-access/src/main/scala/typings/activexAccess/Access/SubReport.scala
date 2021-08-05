package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubReport extends StObject {
  
  /* private */ @JSName("Access.SubReport_typekey")
  var AccessDotSubReport_typekey: SubReport
  
  val Application: typings.activexAccess.Access.Application
  
  val Form: typings.activexAccess.Access.Form
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Parent: js.Any
  
  val Report: typings.activexAccess.Access.Report
}
object SubReport {
  
  inline def apply(
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
  
  extension [Self <: SubReport](x: Self) {
    
    inline def setAccessDotSubReport_typekey(value: SubReport): Self = StObject.set(x, "Access.SubReport_typekey", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setForm(value: Form): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReport(value: Report): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
  }
}
