package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClientVpcConnectionsResponse extends StObject {
  
  /**
    * 
    List of client VPC connections.
    
    */
  var ClientVpcConnections: js.UndefOr[listOfClientVpcConnection] = js.undefined
  
  /**
    * 
    The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the call returns NextToken in the response. 
    To get another batch of configurations, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListClientVpcConnectionsResponse {
  
  inline def apply(): ListClientVpcConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientVpcConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClientVpcConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setClientVpcConnections(value: listOfClientVpcConnection): Self = StObject.set(x, "ClientVpcConnections", value.asInstanceOf[js.Any])
    
    inline def setClientVpcConnectionsUndefined: Self = StObject.set(x, "ClientVpcConnections", js.undefined)
    
    inline def setClientVpcConnectionsVarargs(value: ClientVpcConnection*): Self = StObject.set(x, "ClientVpcConnections", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
