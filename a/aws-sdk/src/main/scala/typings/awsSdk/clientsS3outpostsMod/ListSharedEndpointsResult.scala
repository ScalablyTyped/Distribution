package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSharedEndpointsResult extends StObject {
  
  /**
    * The list of endpoints associated with the specified Outpost that have been shared by Amazon Web Services Resource Access Manager (RAM).
    */
  var Endpoints: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.Endpoints] = js.undefined
  
  /**
    * If the number of endpoints associated with the specified Outpost exceeds MaxResults, you can include this value in subsequent calls to this operation to retrieve more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
}
object ListSharedEndpointsResult {
  
  inline def apply(): ListSharedEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedEndpointsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSharedEndpointsResult] (val x: Self) extends AnyVal {
    
    inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
