package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlatformVersionRequest extends StObject {
  
  /**
    * The name of the builder environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The configuration option settings to apply to the builder environment.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
  
  /**
    * The location of the platform definition archive in Amazon S3.
    */
  var PlatformDefinitionBundle: S3Location
  
  /**
    * The name of your custom platform.
    */
  var PlatformName: typings.awsSdk.clientsElasticbeanstalkMod.PlatformName
  
  /**
    * The number, such as 1.0.2, for the new platform version.
    */
  var PlatformVersion: typings.awsSdk.clientsElasticbeanstalkMod.PlatformVersion
  
  /**
    * Specifies the tags applied to the new platform version. Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the platform version don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Tags] = js.undefined
}
object CreatePlatformVersionRequest {
  
  inline def apply(PlatformDefinitionBundle: S3Location, PlatformName: PlatformName, PlatformVersion: PlatformVersion): CreatePlatformVersionRequest = {
    val __obj = js.Dynamic.literal(PlatformDefinitionBundle = PlatformDefinitionBundle.asInstanceOf[js.Any], PlatformName = PlatformName.asInstanceOf[js.Any], PlatformVersion = PlatformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePlatformVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setPlatformDefinitionBundle(value: S3Location): Self = StObject.set(x, "PlatformDefinitionBundle", value.asInstanceOf[js.Any])
    
    inline def setPlatformName(value: PlatformName): Self = StObject.set(x, "PlatformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersion(value: PlatformVersion): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
