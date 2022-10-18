package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReportPlanOutput extends StObject {
  
  /**
    * Returns details about the report plan that is specified by its name. These details include the report plan's Amazon Resource Name (ARN), description, settings, delivery channel, deployment status, creation time, and last attempted and successful run times.
    */
  var ReportPlan: js.UndefOr[typings.awsSdk.clientsBackupMod.ReportPlan] = js.undefined
}
object DescribeReportPlanOutput {
  
  inline def apply(): DescribeReportPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportPlanOutput]
  }
  
  extension [Self <: DescribeReportPlanOutput](x: Self) {
    
    inline def setReportPlan(value: ReportPlan): Self = StObject.set(x, "ReportPlan", value.asInstanceOf[js.Any])
    
    inline def setReportPlanUndefined: Self = StObject.set(x, "ReportPlan", js.undefined)
  }
}
