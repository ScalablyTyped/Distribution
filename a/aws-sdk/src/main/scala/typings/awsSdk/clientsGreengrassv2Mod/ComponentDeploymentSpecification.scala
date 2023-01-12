package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDeploymentSpecification extends StObject {
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * The configuration updates to deploy for the component. You can define reset updates and merge updates. A reset updates the keys that you specify to the default configuration for the component. A merge updates the core device's component configuration with the keys and values that you specify. The IoT Greengrass Core software applies reset updates before it applies merge updates. For more information, see Update component configurations in the IoT Greengrass V2 Developer Guide.
    */
  var configurationUpdate: js.UndefOr[ComponentConfigurationUpdate] = js.undefined
  
  /**
    * The system user and group that the IoT Greengrass Core software uses to run component processes on the core device. If you omit this parameter, the IoT Greengrass Core software uses the system user and group that you configure for the core device. For more information, see Configure the user and group that run components in the IoT Greengrass V2 Developer Guide.
    */
  var runWith: js.UndefOr[ComponentRunWith] = js.undefined
}
object ComponentDeploymentSpecification {
  
  inline def apply(): ComponentDeploymentSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDeploymentSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentDeploymentSpecification] (val x: Self) extends AnyVal {
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setConfigurationUpdate(value: ComponentConfigurationUpdate): Self = StObject.set(x, "configurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUpdateUndefined: Self = StObject.set(x, "configurationUpdate", js.undefined)
    
    inline def setRunWith(value: ComponentRunWith): Self = StObject.set(x, "runWith", value.asInstanceOf[js.Any])
    
    inline def setRunWithUndefined: Self = StObject.set(x, "runWith", js.undefined)
  }
}
