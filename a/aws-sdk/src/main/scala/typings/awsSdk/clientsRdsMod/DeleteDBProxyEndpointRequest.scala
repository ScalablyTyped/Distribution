package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBProxyEndpointRequest extends StObject {
  
  /**
    * The name of the DB proxy endpoint to delete.
    */
  var DBProxyEndpointName: typings.awsSdk.clientsRdsMod.DBProxyEndpointName
}
object DeleteDBProxyEndpointRequest {
  
  inline def apply(DBProxyEndpointName: DBProxyEndpointName): DeleteDBProxyEndpointRequest = {
    val __obj = js.Dynamic.literal(DBProxyEndpointName = DBProxyEndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBProxyEndpointRequest]
  }
  
  extension [Self <: DeleteDBProxyEndpointRequest](x: Self) {
    
    inline def setDBProxyEndpointName(value: DBProxyEndpointName): Self = StObject.set(x, "DBProxyEndpointName", value.asInstanceOf[js.Any])
  }
}
