package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOsisMod.MaxResults] = js.undefined
  
  /**
    * If your initial ListPipelines operation returns a nextToken, you can include the returned nextToken in subsequent ListPipelines operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOsisMod.NextToken] = js.undefined
}
object ListPipelinesRequest {
  
  inline def apply(): ListPipelinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPipelinesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
