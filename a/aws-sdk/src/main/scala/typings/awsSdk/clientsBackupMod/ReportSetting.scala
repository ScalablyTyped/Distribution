package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportSetting extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the frameworks a report covers.
    */
  var FrameworkArns: js.UndefOr[stringList] = js.undefined
  
  /**
    * The number of frameworks a report covers.
    */
  var NumberOfFrameworks: js.UndefOr[integer] = js.undefined
  
  /**
    * Identifies the report template for the report. Reports are built using a report template. The report templates are:  RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT 
    */
  var ReportTemplate: String
}
object ReportSetting {
  
  inline def apply(ReportTemplate: String): ReportSetting = {
    val __obj = js.Dynamic.literal(ReportTemplate = ReportTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportSetting] (val x: Self) extends AnyVal {
    
    inline def setFrameworkArns(value: stringList): Self = StObject.set(x, "FrameworkArns", value.asInstanceOf[js.Any])
    
    inline def setFrameworkArnsUndefined: Self = StObject.set(x, "FrameworkArns", js.undefined)
    
    inline def setFrameworkArnsVarargs(value: String*): Self = StObject.set(x, "FrameworkArns", js.Array(value*))
    
    inline def setNumberOfFrameworks(value: integer): Self = StObject.set(x, "NumberOfFrameworks", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFrameworksUndefined: Self = StObject.set(x, "NumberOfFrameworks", js.undefined)
    
    inline def setReportTemplate(value: String): Self = StObject.set(x, "ReportTemplate", value.asInstanceOf[js.Any])
  }
}
