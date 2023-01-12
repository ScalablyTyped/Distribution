package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RobotApplicationConfig extends StObject {
  
  /**
    * The application information for the robot application.
    */
  var application: Arn
  
  /**
    * The version of the robot application.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The launch configuration for the robot application.
    */
  var launchConfig: LaunchConfig
  
  /**
    * Information about tools configured for the robot application.
    */
  var tools: js.UndefOr[Tools] = js.undefined
  
  /**
    * The upload configurations for the robot application.
    */
  var uploadConfigurations: js.UndefOr[UploadConfigurations] = js.undefined
  
  /**
    * A Boolean indicating whether to use default robot application tools. The default tools are rviz, rqt, terminal and rosbag record. The default is False.  This API is no longer supported and will throw an error if used. 
    */
  var useDefaultTools: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A Boolean indicating whether to use default upload configurations. By default, .ros and .gazebo files are uploaded when the application terminates and all ROS topics will be recorded. If you set this value, you must specify an outputLocation.  This API is no longer supported and will throw an error if used. 
    */
  var useDefaultUploadConfigurations: js.UndefOr[BoxedBoolean] = js.undefined
}
object RobotApplicationConfig {
  
  inline def apply(application: Arn, launchConfig: LaunchConfig): RobotApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotApplicationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RobotApplicationConfig] (val x: Self) extends AnyVal {
    
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
  }
}
