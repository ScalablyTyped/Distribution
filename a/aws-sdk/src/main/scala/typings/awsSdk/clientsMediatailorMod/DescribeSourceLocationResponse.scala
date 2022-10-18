package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceLocationResponse extends StObject {
  
  /**
    * The access configuration for the source location.
    */
  var AccessConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.AccessConfiguration] = js.undefined
  
  /**
    * The ARN of the source location.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp that indicates when the source location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default segment delivery configuration settings.
    */
  var DefaultSegmentDeliveryConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.DefaultSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The HTTP package configuration settings for the source location.
    */
  var HttpConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.HttpConfiguration] = js.undefined
  
  /**
    * The timestamp that indicates when the source location was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of the segment delivery configurations associated with this resource.
    */
  var SegmentDeliveryConfigurations: js.UndefOr[listOfSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: js.UndefOr[string] = js.undefined
  
  /**
    * The tags assigned to the source location.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object DescribeSourceLocationResponse {
  
  inline def apply(): DescribeSourceLocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSourceLocationResponse]
  }
  
  extension [Self <: DescribeSourceLocationResponse](x: Self) {
    
    inline def setAccessConfiguration(value: AccessConfiguration): Self = StObject.set(x, "AccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigurationUndefined: Self = StObject.set(x, "AccessConfiguration", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
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
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
