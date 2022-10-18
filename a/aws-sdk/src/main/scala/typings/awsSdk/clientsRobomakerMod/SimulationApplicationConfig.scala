package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationApplicationConfig extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  
  /**
    * The version of the simulation application.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The launch configuration for the simulation application.
    */
  var launchConfig: LaunchConfig
  
  /**
    * Information about tools configured for the simulation application.
    */
  var tools: js.UndefOr[Tools] = js.undefined
  
  /**
    * Information about upload configurations for the simulation application.
    */
  var uploadConfigurations: js.UndefOr[UploadConfigurations] = js.undefined
  
  /**
    * A Boolean indicating whether to use default simulation application tools. The default tools are rviz, rqt, terminal and rosbag record. The default is False.  This API is no longer supported and will throw an error if used. 
    */
  var useDefaultTools: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A Boolean indicating whether to use default upload configurations. By default, .ros and .gazebo files are uploaded when the application terminates and all ROS topics will be recorded. If you set this value, you must specify an outputLocation.  This API is no longer supported and will throw an error if used. 
    */
  var useDefaultUploadConfigurations: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A list of world configurations.
    */
  var worldConfigs: js.UndefOr[WorldConfigs] = js.undefined
}
object SimulationApplicationConfig {
  
  inline def apply(application: Arn, launchConfig: LaunchConfig): SimulationApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationApplicationConfig]
  }
  
  extension [Self <: SimulationApplicationConfig](x: Self) {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    inline def setLaunchConfig(value: LaunchConfig): Self = StObject.set(x, "launchConfig", value.asInstanceOf[js.Any])
    
    inline def setTools(value: Tools): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: Tool*): Self = StObject.set(x, "tools", js.Array(value*))
    
    inline def setUploadConfigurations(value: UploadConfigurations): Self = StObject.set(x, "uploadConfigurations", value.asInstanceOf[js.Any])
    
    inline def setUploadConfigurationsUndefined: Self = StObject.set(x, "uploadConfigurations", js.undefined)
    
    inline def setUploadConfigurationsVarargs(value: UploadConfiguration*): Self = StObject.set(x, "uploadConfigurations", js.Array(value*))
    
    inline def setUseDefaultTools(value: BoxedBoolean): Self = StObject.set(x, "useDefaultTools", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultToolsUndefined: Self = StObject.set(x, "useDefaultTools", js.undefined)
    
    inline def setUseDefaultUploadConfigurations(value: BoxedBoolean): Self = StObject.set(x, "useDefaultUploadConfigurations", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultUploadConfigurationsUndefined: Self = StObject.set(x, "useDefaultUploadConfigurations", js.undefined)
    
    inline def setWorldConfigs(value: WorldConfigs): Self = StObject.set(x, "worldConfigs", value.asInstanceOf[js.Any])
    
    inline def setWorldConfigsUndefined: Self = StObject.set(x, "worldConfigs", js.undefined)
    
    inline def setWorldConfigsVarargs(value: WorldConfig*): Self = StObject.set(x, "worldConfigs", js.Array(value*))
  }
}
