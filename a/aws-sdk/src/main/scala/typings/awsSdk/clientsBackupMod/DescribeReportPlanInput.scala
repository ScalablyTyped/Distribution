package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReportPlanInput extends StObject {
  
  /**
    * The unique name of a report plan.
    */
  var ReportPlanName: typings.awsSdk.clientsBackupMod.ReportPlanName
}
object DescribeReportPlanInput {
  
  inline def apply(ReportPlanName: ReportPlanName): DescribeReportPlanInput = {
    val __obj = js.Dynamic.literal(ReportPlanName = ReportPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportPlanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReportPlanInput] (val x: Self) extends AnyVal {
    
    inline def setReportPlanName(value: ReportPlanName): Self = StObject.set(x, "ReportPlanName", value.asInstanceOf[js.Any])
  }
}
