package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedConfigurationVersionSummary extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.undefined
  
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.undefined
  
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * The configuration version.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object HostedConfigurationVersionSummary {
  
  @scala.inline
  def apply(): HostedConfigurationVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedConfigurationVersionSummary]
  }
  
  @scala.inline
  implicit class HostedConfigurationVersionSummaryMutableBuilder[Self <: HostedConfigurationVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileIdUndefined: Self = StObject.set(x, "ConfigurationProfileId", js.undefined)
    
    @scala.inline
    def setContentType(value: StringWithLengthBetween1And255): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
