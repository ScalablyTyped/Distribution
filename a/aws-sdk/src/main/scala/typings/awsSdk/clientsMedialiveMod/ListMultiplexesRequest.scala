package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultiplexesRequest extends StObject {
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MaxResults] = js.undefined
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListMultiplexesRequest {
  
  inline def apply(): ListMultiplexesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMultiplexesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
