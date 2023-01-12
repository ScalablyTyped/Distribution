package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportPlansOutput extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of your report plans with detailed information for each plan. This information includes the Amazon Resource Name (ARN), report plan name, description, settings, delivery channel, deployment status, creation time, and last times the report plan attempted to and successfully ran.
    */
  var ReportPlans: js.UndefOr[ReportPlanList] = js.undefined
}
object ListReportPlansOutput {
  
  inline def apply(): ListReportPlansOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportPlansOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReportPlansOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReportPlans(value: ReportPlanList): Self = StObject.set(x, "ReportPlans", value.asInstanceOf[js.Any])
    
    inline def setReportPlansUndefined: Self = StObject.set(x, "ReportPlans", js.undefined)
    
    inline def setReportPlansVarargs(value: ReportPlan*): Self = StObject.set(x, "ReportPlans", js.Array(value*))
  }
}
