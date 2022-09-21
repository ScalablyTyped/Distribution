package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReportPlanInput extends StObject {
  
  /**
    * The unique name of a report plan.
    */
  var ReportPlanName: typings.awsSdk.backupMod.ReportPlanName
}
object DescribeReportPlanInput {
  
  inline def apply(ReportPlanName: ReportPlanName): DescribeReportPlanInput = {
    val __obj = js.Dynamic.literal(ReportPlanName = ReportPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportPlanInput]
  }
  
  extension [Self <: DescribeReportPlanInput](x: Self) {
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
  }
}
