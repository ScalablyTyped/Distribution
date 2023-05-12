package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSharedEndpointsRequest extends StObject {
  
  /**
    * The maximum number of endpoints that will be returned in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.MaxResults] = js.undefined
  
  /**
    * If a previous response from this operation included a NextToken value, you can provide that value here to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Outpost.
    */
  var OutpostId: typings.awsSdk.clientsS3outpostsMod.OutpostId
}
object ListSharedEndpointsRequest {
  
  inline def apply(OutpostId: OutpostId): ListSharedEndpointsRequest = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSharedEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSharedEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
