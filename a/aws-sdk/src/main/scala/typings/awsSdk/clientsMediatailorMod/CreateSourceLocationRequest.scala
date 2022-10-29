package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSourceLocationRequest extends StObject {
  
  /**
    * Access configuration parameters. Configures the type of authentication used to access content from your source location.
    */
  var AccessConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.AccessConfiguration] = js.undefined
  
  /**
    * The optional configuration for the server that serves segments.
    */
  var DefaultSegmentDeliveryConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.DefaultSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The source's HTTP package configurations.
    */
  var HttpConfiguration: typings.awsSdk.clientsMediatailorMod.HttpConfiguration
  
  /**
    * A list of the segment delivery configurations associated with this resource.
    */
  var SegmentDeliveryConfigurations: js.UndefOr[listOfSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The name associated with the source location.
    */
  var SourceLocationName: _String
  
  /**
    * The tags to assign to the source location. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateSourceLocationRequest {
  
  inline def apply(HttpConfiguration: HttpConfiguration, SourceLocationName: _String): CreateSourceLocationRequest = {
    val __obj = js.Dynamic.literal(HttpConfiguration = HttpConfiguration.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSourceLocationRequest]
  }
  
  extension [Self <: CreateSourceLocationRequest](x: Self) {
    
    inline def setAccessConfiguration(value: AccessConfiguration): Self = StObject.set(x, "AccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigurationUndefined: Self = StObject.set(x, "AccessConfiguration", js.undefined)
    
    inline def setDefaultSegmentDeliveryConfiguration(value: DefaultSegmentDeliveryConfiguration): Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultSegmentDeliveryConfigurationUndefined: Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", js.undefined)
    
    inline def setHttpConfiguration(value: HttpConfiguration): Self = StObject.set(x, "HttpConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSegmentDeliveryConfigurations(value: listOfSegmentDeliveryConfiguration): Self = StObject.set(x, "SegmentDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSegmentDeliveryConfigurationsUndefined: Self = StObject.set(x, "SegmentDeliveryConfigurations", js.undefined)
    
    inline def setSegmentDeliveryConfigurationsVarargs(value: SegmentDeliveryConfiguration*): Self = StObject.set(x, "SegmentDeliveryConfigurations", js.Array(value*))
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
