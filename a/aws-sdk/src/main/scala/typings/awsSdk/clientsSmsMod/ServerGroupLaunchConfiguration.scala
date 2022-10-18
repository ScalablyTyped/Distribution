package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupLaunchConfiguration extends StObject {
  
  /**
    * The launch order of servers in the server group.
    */
  var launchOrder: js.UndefOr[LaunchOrder] = js.undefined
  
  /**
    * The ID of the server group with which the launch configuration is associated.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  
  /**
    * The launch configuration for servers in the server group.
    */
  var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.undefined
}
object ServerGroupLaunchConfiguration {
  
  inline def apply(): ServerGroupLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupLaunchConfiguration]
  }
  
  extension [Self <: ServerGroupLaunchConfiguration](x: Self) {
    
    inline def setLaunchOrder(value: LaunchOrder): Self = StObject.set(x, "launchOrder", value.asInstanceOf[js.Any])
    
    inline def setLaunchOrderUndefined: Self = StObject.set(x, "launchOrder", js.undefined)
    
    inline def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    inline def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    inline def setServerLaunchConfigurations(value: ServerLaunchConfigurations): Self = StObject.set(x, "serverLaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerLaunchConfigurationsUndefined: Self = StObject.set(x, "serverLaunchConfigurations", js.undefined)
    
    inline def setServerLaunchConfigurationsVarargs(value: ServerLaunchConfiguration*): Self = StObject.set(x, "serverLaunchConfigurations", js.Array(value*))
  }
}
