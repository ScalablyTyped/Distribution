package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppReplicationConfigurationResponse extends StObject {
  
  /**
    * The replication configurations associated with server groups in this application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
}
object GetAppReplicationConfigurationResponse {
  
  inline def apply(): GetAppReplicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAppReplicationConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = StObject.set(x, "serverGroupReplicationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerGroupReplicationConfigurationsUndefined: Self = StObject.set(x, "serverGroupReplicationConfigurations", js.undefined)
    
    inline def setServerGroupReplicationConfigurationsVarargs(value: ServerGroupReplicationConfiguration*): Self = StObject.set(x, "serverGroupReplicationConfigurations", js.Array(value*))
  }
}
