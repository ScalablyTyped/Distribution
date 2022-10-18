package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedConfigurationVersion extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.undefined
  
  /**
    * The content of the configuration or the configuration data.
    */
  var Content: js.UndefOr[_Blob] = js.undefined
  
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.undefined
  
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The configuration version.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object HostedConfigurationVersion {
  
  inline def apply(): HostedConfigurationVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedConfigurationVersion]
  }
  
  extension [Self <: HostedConfigurationVersion](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileIdUndefined: Self = StObject.set(x, "ConfigurationProfileId", js.undefined)
    
    inline def setContent(value: _Blob): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: StringWithLengthBetween1And255): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
