package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCompilationJobsResponse extends StObject {
  
  /**
    * An array of CompilationJobSummary objects, each describing a model compilation job. 
    */
  var CompilationJobSummaries: typings.awsSdk.clientsSagemakerMod.CompilationJobSummaries
  
  /**
    * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListCompilationJobsResponse {
  
  inline def apply(CompilationJobSummaries: CompilationJobSummaries): ListCompilationJobsResponse = {
    val __obj = js.Dynamic.literal(CompilationJobSummaries = CompilationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCompilationJobsResponse]
  }
  
  extension [Self <: ListCompilationJobsResponse](x: Self) {
    
    inline def setCompilationJobSummaries(value: CompilationJobSummaries): Self = StObject.set(x, "CompilationJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobSummariesVarargs(value: CompilationJobSummary*): Self = StObject.set(x, "CompilationJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
