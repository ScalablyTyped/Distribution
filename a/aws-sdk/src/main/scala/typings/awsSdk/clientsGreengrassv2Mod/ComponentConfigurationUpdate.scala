package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConfigurationUpdate extends StObject {
  
  /**
    * A serialized JSON string that contains the configuration object to merge to target devices. The core device merges this configuration with the component's existing configuration. If this is the first time a component deploys on a device, the core device merges this configuration with the component's default configuration. This means that the core device keeps it's existing configuration for keys and values that you don't specify in this object. For more information, see Merge configuration updates in the IoT Greengrass V2 Developer Guide.
    */
  var merge: js.UndefOr[ComponentConfigurationString] = js.undefined
  
  /**
    * The list of configuration nodes to reset to default values on target devices. Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (/) and use forward slashes to separate the key for each level in the object. For more information, see the JSON pointer specification and Reset configuration updates in the IoT Greengrass V2 Developer Guide.
    */
  var reset: js.UndefOr[ComponentConfigurationPathList] = js.undefined
}
object ComponentConfigurationUpdate {
  
  inline def apply(): ComponentConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentConfigurationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentConfigurationUpdate] (val x: Self) extends AnyVal {
    
    inline def setMerge(value: ComponentConfigurationString): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setReset(value: ComponentConfigurationPathList): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResetVarargs(value: ComponentConfigurationPath*): Self = StObject.set(x, "reset", js.Array(value*))
  }
}
