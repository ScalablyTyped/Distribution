package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHostedConfigurationVersionRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id
  
  /**
    * The content of the configuration or the configuration data.
    */
  var Content: _Blob
  
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: StringWithLengthBetween1And255
  
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * An optional locking token used to prevent race conditions from overwriting configuration updates when creating a new version. To ensure your data is not overwritten when creating multiple hosted configuration versions in rapid succession, specify the version of the latest hosted configuration version.
    */
  var LatestVersionNumber: js.UndefOr[Integer] = js.undefined
}
object CreateHostedConfigurationVersionRequest {
  
  inline def apply(
    ApplicationId: Id,
    ConfigurationProfileId: Id,
    Content: _Blob,
    ContentType: StringWithLengthBetween1And255
  ): CreateHostedConfigurationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedConfigurationVersionRequest]
  }
  
  extension [Self <: CreateHostedConfigurationVersionRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setContent(value: _Blob): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: StringWithLengthBetween1And255): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLatestVersionNumber(value: Integer): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
  }
}
