package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternetHealth extends StObject {
  
  /**
    * Availability in Internet Monitor represents the estimated percentage of traffic that is not seeing an availability drop. For example, an availability score of 99% for an end user and service location pair is equivalent to 1% of the traffic experiencing an availability drop for that pair. For more information, see How Internet Monitor calculates performance and availability scores in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var Availability: js.UndefOr[AvailabilityMeasurement] = js.undefined
  
  /**
    * Performance in Internet Monitor represents the estimated percentage of traffic that is not seeing a performance drop. For example, a performance score of 99% for an end user and service location pair is equivalent to 1% of the traffic experiencing a performance drop for that pair. For more information, see How Internet Monitor calculates performance and availability scores in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var Performance: js.UndefOr[PerformanceMeasurement] = js.undefined
}
object InternetHealth {
  
  inline def apply(): InternetHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetHealth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternetHealth] (val x: Self) extends AnyVal {
    
    inline def setAvailability(value: AvailabilityMeasurement): Self = StObject.set(x, "Availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "Availability", js.undefined)
    
    inline def setPerformance(value: PerformanceMeasurement): Self = StObject.set(x, "Performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "Performance", js.undefined)
  }
}
