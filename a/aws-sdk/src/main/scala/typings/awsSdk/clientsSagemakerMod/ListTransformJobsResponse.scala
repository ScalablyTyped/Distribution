package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransformJobsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * An array of TransformJobSummary objects.
    */
  var TransformJobSummaries: typings.awsSdk.clientsSagemakerMod.TransformJobSummaries
}
object ListTransformJobsResponse {
  
  inline def apply(TransformJobSummaries: TransformJobSummaries): ListTransformJobsResponse = {
    val __obj = js.Dynamic.literal(TransformJobSummaries = TransformJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTransformJobsResponse]
  }
  
  extension [Self <: ListTransformJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransformJobSummaries(value: TransformJobSummaries): Self = StObject.set(x, "TransformJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setTransformJobSummariesVarargs(value: TransformJobSummary*): Self = StObject.set(x, "TransformJobSummaries", js.Array(value*))
  }
}
