package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerReplicationConfiguration extends StObject {
  
  /**
    * The ID of the server with which this replication configuration is associated.
    */
  var server: js.UndefOr[Server] = js.undefined
  
  /**
    * The parameters for replicating the server.
    */
  var serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.undefined
}
object ServerReplicationConfiguration {
  
  inline def apply(): ServerReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerReplicationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerReplicationParameters(value: ServerReplicationParameters): Self = StObject.set(x, "serverReplicationParameters", value.asInstanceOf[js.Any])
    
    inline def setServerReplicationParametersUndefined: Self = StObject.set(x, "serverReplicationParameters", js.undefined)
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
