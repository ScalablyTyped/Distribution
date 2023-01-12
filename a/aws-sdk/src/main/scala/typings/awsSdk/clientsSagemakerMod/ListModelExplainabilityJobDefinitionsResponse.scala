package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelExplainabilityJobDefinitionsResponse extends StObject {
  
  /**
    * A JSON array in which each element is a summary for a explainability bias jobs.
    */
  var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListModelExplainabilityJobDefinitionsResponse {
  
  inline def apply(JobDefinitionSummaries: MonitoringJobDefinitionSummaryList): ListModelExplainabilityJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionSummaries = JobDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelExplainabilityJobDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelExplainabilityJobDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobDefinitionSummaries(value: MonitoringJobDefinitionSummaryList): Self = StObject.set(x, "JobDefinitionSummaries", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionSummariesVarargs(value: MonitoringJobDefinitionSummary*): Self = StObject.set(x, "JobDefinitionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
