package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOsisMod.NextToken] = js.undefined
  
  /**
    * A list of all existing Data Prepper pipelines.
    */
  var Pipelines: js.UndefOr[PipelineSummaryList] = js.undefined
}
object ListPipelinesResponse {
  
  inline def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPipelinesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelines(value: PipelineSummaryList): Self = StObject.set(x, "Pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "Pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: PipelineSummary*): Self = StObject.set(x, "Pipelines", js.Array(value*))
  }
}
