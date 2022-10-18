package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * The app block ARN to which the application should be associated
    */
  var AppBlockArn: Arn
  
  /**
    * The description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Description] = js.undefined
  
  /**
    * The display name of the application. This name is visible to users in the application catalog.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsAppstreamMod.DisplayName] = js.undefined
  
  /**
    * The location in S3 of the application icon.
    */
  var IconS3Location: S3Location
  
  /**
    * The instance families the application supports. Valid values are GENERAL_PURPOSE and GRAPHICS_G4.
    */
  var InstanceFamilies: StringList
  
  /**
    * The launch parameters of the application.
    */
  var LaunchParameters: js.UndefOr[String] = js.undefined
  
  /**
    * The launch path of the application.
    */
  var LaunchPath: String
  
  /**
    * The name of the application. This name is visible to users when display name is not specified.
    */
  var Name: typings.awsSdk.clientsAppstreamMod.Name
  
  /**
    * The platforms the application supports. WINDOWS_SERVER_2019 and AMAZON_LINUX2 are supported for Elastic fleets.
    */
  var Platforms: typings.awsSdk.clientsAppstreamMod.Platforms
  
  /**
    * The tags assigned to the application.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Tags] = js.undefined
  
  /**
    * The working directory of the application.
    */
  var WorkingDirectory: js.UndefOr[String] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(
    AppBlockArn: Arn,
    IconS3Location: S3Location,
    InstanceFamilies: StringList,
    LaunchPath: String,
    Name: Name,
    Platforms: Platforms
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(AppBlockArn = AppBlockArn.asInstanceOf[js.Any], IconS3Location = IconS3Location.asInstanceOf[js.Any], InstanceFamilies = InstanceFamilies.asInstanceOf[js.Any], LaunchPath = LaunchPath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Platforms = Platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  extension [Self <: CreateApplicationRequest](x: Self) {
    
    inline def setAppBlockArn(value: Arn): Self = StObject.set(x, "AppBlockArn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setIconS3Location(value: S3Location): Self = StObject.set(x, "IconS3Location", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilies(value: StringList): Self = StObject.set(x, "InstanceFamilies", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamiliesVarargs(value: String*): Self = StObject.set(x, "InstanceFamilies", js.Array(value*))
    
    inline def setLaunchParameters(value: String): Self = StObject.set(x, "LaunchParameters", value.asInstanceOf[js.Any])
    
    inline def setLaunchParametersUndefined: Self = StObject.set(x, "LaunchParameters", js.undefined)
    
    inline def setLaunchPath(value: String): Self = StObject.set(x, "LaunchPath", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlatforms(value: Platforms): Self = StObject.set(x, "Platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: PlatformType*): Self = StObject.set(x, "Platforms", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
