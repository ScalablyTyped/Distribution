package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBProxyEndpointResponse extends StObject {
  
  /**
    * The data structure representing the details of the DB proxy endpoint that you delete.
    */
  var DBProxyEndpoint: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxyEndpoint] = js.undefined
}
object DeleteDBProxyEndpointResponse {
  
  inline def apply(): DeleteDBProxyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBProxyEndpointResponse]
  }
  
  extension [Self <: DeleteDBProxyEndpointResponse](x: Self) {
    
    inline def setDBProxyEndpoint(value: DBProxyEndpoint): Self = StObject.set(x, "DBProxyEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointUndefined: Self = StObject.set(x, "DBProxyEndpoint", js.undefined)
  }
}
