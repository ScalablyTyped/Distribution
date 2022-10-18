package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineParametersForExecutionRequest extends StObject {
  
  /**
    * The maximum number of parameters to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the result of the previous ListPipelineParametersForExecution request was truncated, the response includes a NextToken. To retrieve the next set of parameters, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: typings.awsSdk.clientsSagemakerMod.PipelineExecutionArn
}
object ListPipelineParametersForExecutionRequest {
  
  inline def apply(PipelineExecutionArn: PipelineExecutionArn): ListPipelineParametersForExecutionRequest = {
    val __obj = js.Dynamic.literal(PipelineExecutionArn = PipelineExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelineParametersForExecutionRequest]
  }
  
  extension [Self <: ListPipelineParametersForExecutionRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
  }
}
