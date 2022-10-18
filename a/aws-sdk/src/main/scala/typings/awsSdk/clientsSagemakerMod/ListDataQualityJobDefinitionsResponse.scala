package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataQualityJobDefinitionsResponse extends StObject {
  
  /**
    * A list of data quality monitoring job definitions.
    */
  var JobDefinitionSummaries: MonitoringJobDefinitionSummaryList
  
  /**
    * If the result of the previous ListDataQualityJobDefinitions request was truncated, the response includes a NextToken. To retrieve the next set of data quality monitoring job definitions, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListDataQualityJobDefinitionsResponse {
  
  inline def apply(JobDefinitionSummaries: MonitoringJobDefinitionSummaryList): ListDataQualityJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionSummaries = JobDefinitionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataQualityJobDefinitionsResponse]
  }
  
  extension [Self <: ListDataQualityJobDefinitionsResponse](x: Self) {
    
    inline def setJobDefinitionSummaries(value: MonitoringJobDefinitionSummaryList): Self = StObject.set(x, "JobDefinitionSummaries", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionSummariesVarargs(value: MonitoringJobDefinitionSummary*): Self = StObject.set(x, "JobDefinitionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
