package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesInput extends StObject {
  
  /**
    * The maximum number of pipelines to return in a single call. To retrieve the remaining pipelines, make another call with the returned nextToken value. The minimum value you can specify is 1. The maximum accepted value is 1000.
    */
  var maxResults: js.UndefOr[MaxPipelines] = js.undefined
  
  /**
    * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListPipelinesInput {
  
  inline def apply(): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesInput]
  }
  
  extension [Self <: ListPipelinesInput](x: Self) {
    
    inline def setMaxResults(value: MaxPipelines): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
