package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReportPlanInput extends StObject {
  
  /**
    * The unique name of a report plan.
    */
  var ReportPlanName: typings.awsSdk.clientsBackupMod.ReportPlanName
}
object DeleteReportPlanInput {
  
  inline def apply(ReportPlanName: ReportPlanName): DeleteReportPlanInput = {
    val __obj = js.Dynamic.literal(ReportPlanName = ReportPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportPlanInput]
  }
  
  extension [Self <: DeleteReportPlanInput](x: Self) {
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
  }
}
