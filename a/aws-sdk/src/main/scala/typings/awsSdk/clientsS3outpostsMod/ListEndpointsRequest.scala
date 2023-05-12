package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointsRequest extends StObject {
  
  /**
    * The maximum number of endpoints that will be returned in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.MaxResults] = js.undefined
  
  /**
    * If a previous response from this operation included a NextToken value, provide that value here to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
}
object ListEndpointsRequest {
  
  inline def apply(): ListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
