package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSourceLocationRequest extends StObject {
  
  /**
    * Access configuration parameters. Configures the type of authentication used to access content from your source location.
    */
  var AccessConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.AccessConfiguration] = js.undefined
  
  /**
    * The optional configuration for the host server that serves segments.
    */
  var DefaultSegmentDeliveryConfiguration: js.UndefOr[typings.awsSdk.clientsMediatailorMod.DefaultSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The HTTP configuration for the source location.
    */
  var HttpConfiguration: typings.awsSdk.clientsMediatailorMod.HttpConfiguration
  
  /**
    * A list of the segment delivery configurations associated with this resource.
    */
  var SegmentDeliveryConfigurations: js.UndefOr[listOfSegmentDeliveryConfiguration] = js.undefined
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
}
object UpdateSourceLocationRequest {
  
  inline def apply(HttpConfiguration: HttpConfiguration, SourceLocationName: string): UpdateSourceLocationRequest = {
    val __obj = js.Dynamic.literal(HttpConfiguration = HttpConfiguration.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSourceLocationRequest]
  }
  
  extension [Self <: UpdateSourceLocationRequest](x: Self) {
    
    inline def setAccessConfiguration(value: AccessConfiguration): Self = StObject.set(x, "AccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAccessConfigurationUndefined: Self = StObject.set(x, "AccessConfiguration", js.undefined)
    
    inline def setDefaultSegmentDeliveryConfiguration(value: DefaultSegmentDeliveryConfiguration): Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultSegmentDeliveryConfigurationUndefined: Self = StObject.set(x, "DefaultSegmentDeliveryConfiguration", js.undefined)
    
    inline def setHttpConfiguration(value: HttpConfiguration): Self = StObject.set(x, "HttpConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSegmentDeliveryConfigurations(value: listOfSegmentDeliveryConfiguration): Self = StObject.set(x, "SegmentDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSegmentDeliveryConfigurationsUndefined: Self = StObject.set(x, "SegmentDeliveryConfigurations", js.undefined)
    
    inline def setSegmentDeliveryConfigurationsVarargs(value: SegmentDeliveryConfiguration*): Self = StObject.set(x, "SegmentDeliveryConfigurations", js.Array(value*))
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
