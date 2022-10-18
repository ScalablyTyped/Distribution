package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBClusterEndpointMessage extends StObject {
  
  /**
    * The identifier associated with the custom endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String
}
object DeleteDBClusterEndpointMessage {
  
  inline def apply(DBClusterEndpointIdentifier: String): DeleteDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterEndpointMessage]
  }
  
  extension [Self <: DeleteDBClusterEndpointMessage](x: Self) {
    
    inline def setDBClusterEndpointIdentifier(value: String): Self = StObject.set(x, "DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
  }
}
