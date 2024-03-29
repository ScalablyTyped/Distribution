package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEdgeDeploymentPlansResponse extends StObject {
  
  /**
    * List of summaries of edge deployment plans.
    */
  var EdgeDeploymentPlanSummaries: typings.awsSdk.clientsSagemakerMod.EdgeDeploymentPlanSummaries
  
  /**
    * The token to use when calling the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListEdgeDeploymentPlansResponse {
  
  inline def apply(EdgeDeploymentPlanSummaries: EdgeDeploymentPlanSummaries): ListEdgeDeploymentPlansResponse = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanSummaries = EdgeDeploymentPlanSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEdgeDeploymentPlansResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEdgeDeploymentPlansResponse] (val x: Self) extends AnyVal {
    
    inline def setEdgeDeploymentPlanSummaries(value: EdgeDeploymentPlanSummaries): Self = StObject.set(x, "EdgeDeploymentPlanSummaries", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanSummariesVarargs(value: EdgeDeploymentPlanSummary*): Self = StObject.set(x, "EdgeDeploymentPlanSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
