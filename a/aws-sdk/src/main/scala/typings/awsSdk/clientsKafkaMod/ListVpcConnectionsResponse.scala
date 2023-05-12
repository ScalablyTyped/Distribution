package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcConnectionsResponse extends StObject {
  
  /**
    * 
    The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the call returns NextToken in the response. 
    To get another batch of configurations, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * 
    List of VPC connections.
    
    */
  var VpcConnections: js.UndefOr[listOfVpcConnection] = js.undefined
}
object ListVpcConnectionsResponse {
  
  inline def apply(): ListVpcConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVpcConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcConnections(value: listOfVpcConnection): Self = StObject.set(x, "VpcConnections", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionsUndefined: Self = StObject.set(x, "VpcConnections", js.undefined)
    
    inline def setVpcConnectionsVarargs(value: VpcConnection*): Self = StObject.set(x, "VpcConnections", js.Array(value*))
  }
}
