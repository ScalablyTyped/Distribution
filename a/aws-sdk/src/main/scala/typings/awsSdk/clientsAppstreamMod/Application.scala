package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /**
    * The app block ARN of the application.
    */
  var AppBlockArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the application.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Arn] = js.undefined
  
  /**
    * The time at which the application was created within the app block.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the application.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The application name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * If there is a problem, the application can be disabled after image creation.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The S3 location of the application icon.
    */
  var IconS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * The URL for the application icon. This URL might be time-limited.
    */
  var IconURL: js.UndefOr[String] = js.undefined
  
  /**
    * The instance families for the application.
    */
  var InstanceFamilies: js.UndefOr[StringList] = js.undefined
  
  /**
    * The arguments that are passed to the application at launch.
    */
  var LaunchParameters: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the application executable in the instance.
    */
  var LaunchPath: js.UndefOr[String] = js.undefined
  
  /**
    * Additional attributes that describe the application.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Metadata] = js.undefined
  
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The platforms on which the application can run.
    */
  var Platforms: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Platforms] = js.undefined
  
  /**
    * The working directory for the application.
    */
  var WorkingDirectory: js.UndefOr[String] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  extension [Self <: Application](x: Self) {
    
    inline def setAppBlockArn(value: Arn): Self = StObject.set(x, "AppBlockArn", value.asInstanceOf[js.Any])
    
    inline def setAppBlockArnUndefined: Self = StObject.set(x, "AppBlockArn", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIconS3Location(value: S3Location): Self = StObject.set(x, "IconS3Location", value.asInstanceOf[js.Any])
    
    inline def setIconS3LocationUndefined: Self = StObject.set(x, "IconS3Location", js.undefined)
    
    inline def setIconURL(value: String): Self = StObject.set(x, "IconURL", value.asInstanceOf[js.Any])
    
    inline def setIconURLUndefined: Self = StObject.set(x, "IconURL", js.undefined)
    
    inline def setInstanceFamilies(value: StringList): Self = StObject.set(x, "InstanceFamilies", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamiliesUndefined: Self = StObject.set(x, "InstanceFamilies", js.undefined)
    
    inline def setInstanceFamiliesVarargs(value: String*): Self = StObject.set(x, "InstanceFamilies", js.Array(value*))
    
    inline def setLaunchParameters(value: String): Self = StObject.set(x, "LaunchParameters", value.asInstanceOf[js.Any])
    
    inline def setLaunchParametersUndefined: Self = StObject.set(x, "LaunchParameters", js.undefined)
    
    inline def setLaunchPath(value: String): Self = StObject.set(x, "LaunchPath", value.asInstanceOf[js.Any])
    
    inline def setLaunchPathUndefined: Self = StObject.set(x, "LaunchPath", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPlatforms(value: Platforms): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "Platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: PlatformType*): Self = StObject.set(x, "Platforms", js.Array(value*))
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
