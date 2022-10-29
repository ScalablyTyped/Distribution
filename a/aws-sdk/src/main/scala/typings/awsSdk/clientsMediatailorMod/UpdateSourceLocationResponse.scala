package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSourceLocationResponse extends StObject {
  
  /**
    * Access configuration parameters. Configures the type of authentication used to access content from your source location.
    */
  var AccessConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.AccessConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) associated with the source location.
    */
  var Arn: js.UndefOr[_String] = js.undefined
  
  /**
    * The timestamp that indicates when the source location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The optional configuration for the host server that serves segments.
    */
  var DefaultSegmentDeliveryConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.DefaultSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The HTTP configuration for the source location.
    */
  var HttpConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.HttpConfiguration] = js.undefined
  
  /**
    * The timestamp that indicates when the source location was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The segment delivery configurations for the source location. For information about MediaTailor configurations, see Working with configurations in AWS Elemental MediaTailor.
    */
  var SegmentDeliveryConfigurations: js.UndefOr[listOfSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: js.UndefOr[_String] = js.undefined
  
  /**
    * The tags to assign to the source location. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object UpdateSourceLocationResponse {
  
  inline def apply(): UpdateSourceLocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSourceLocationResponse]
  }
  
  extension [Self <: UpdateSourceLocationResponse](x: Self) {
    
    inline def setAccessConfiguration(value: AccessConfiguration): Self = StObject.set(x, "AccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigurationUndefined: Self = StObject.set(x, "AccessConfiguration", js.undefined)
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDefaultSegmentDeliveryConfiguration(value: DefaultSegmentDeliveryConfiguration): Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultSegmentDeliveryConfigurationUndefined: Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", js.undefined)
    
    inline def setHttpConfiguration(value: HttpConfiguration): Self = StObject.set(x, "HttpConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHttpConfigurationUndefined: Self = StObject.set(x, "HttpConfiguration", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSegmentDeliveryConfigurations(value: listOfSegmentDeliveryConfiguration): Self = StObject.set(x, "SegmentDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSegmentDeliveryConfigurationsUndefined: Self = StObject.set(x, "SegmentDeliveryConfigurations", js.undefined)
    
    inline def setSegmentDeliveryConfigurationsVarargs(value: SegmentDeliveryConfiguration*): Self = StObject.set(x, "SegmentDeliveryConfigurations", js.Array(value*))
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
