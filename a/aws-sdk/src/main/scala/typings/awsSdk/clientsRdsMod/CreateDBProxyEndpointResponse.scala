package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBProxyEndpointResponse extends StObject {
  
  /**
    * The DBProxyEndpoint object that is created by the API operation. The DB proxy endpoint that you create might provide capabilities such as read/write or read-only operations, or using a different VPC than the proxy's default VPC.
    */
  var DBProxyEndpoint: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxyEndpoint] = js.undefined
}
object CreateDBProxyEndpointResponse {
  
  inline def apply(): CreateDBProxyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBProxyEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBProxyEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setDBProxyEndpoint(value: DBProxyEndpoint): Self = StObject.set(x, "DBProxyEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointUndefined: Self = StObject.set(x, "DBProxyEndpoint", js.undefined)
  }
}
