package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLocation extends StObject {
  
  /**
    * The access configuration for the source location.
    */
  var AccessConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.AccessConfiguration] = js.undefined
  
  /**
    * The ARN of the SourceLocation.
    */
  var Arn: _String
  
  /**
    * The timestamp that indicates when the source location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default segment delivery configuration.
    */
  var DefaultSegmentDeliveryConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.DefaultSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The HTTP configuration for the source location.
    */
  var HttpConfiguration: typings.awsSdk.clientsMediatailorMod.HttpConfiguration
  
  /**
    * The timestamp that indicates when the source location was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The segment delivery configurations for the source location.
    */
  var SegmentDeliveryConfigurations: js.UndefOr[listOfSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: _String
  
  /**
    * The tags assigned to the source location. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object SourceLocation {
  
  inline def apply(Arn: _String, HttpConfiguration: HttpConfiguration, SourceLocationName: _String): SourceLocation = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], HttpConfiguration = HttpConfiguration.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
  
  extension [Self <: SourceLocation](x: Self) {
    
    inline def setAccessConfiguration(value: AccessConfiguration): Self = StObject.set(x, "AccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigurationUndefined: Self = StObject.set(x, "AccessConfiguration", js.undefined)
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDefaultSegmentDeliveryConfiguration(value: DefaultSegmentDeliveryConfiguration): Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultSegmentDeliveryConfigurationUndefined: Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", js.undefined)
    
    inline def setHttpConfiguration(value: HttpConfiguration): Self = StObject.set(x, "HttpConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSegmentDeliveryConfigurations(value: listOfSegmentDeliveryConfiguration): Self = StObject.set(x, "SegmentDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSegmentDeliveryConfigurationsUndefined: Self = StObject.set(x, "SegmentDeliveryConfigurations", js.undefined)
    
    inline def setSegmentDeliveryConfigurationsVarargs(value: SegmentDeliveryConfiguration*): Self = StObject.set(x, "SegmentDeliveryConfigurations", js.Array(value*))
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
