package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMeasurement extends StObject {
  
  /**
    * Experience scores, or health scores, are calculated for different geographic and network provider combinations (that is, different granularities) and also totaled into global scores. If you view performance or availability scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor provides global health scores. The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information about how Internet Monitor calculates health scores, including performance and availability scores, and when it creates and resolves health events. For more information, see How Amazon Web Services calculates performance and availability scores in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var ExperienceScore: js.UndefOr[Double] = js.undefined
  
  /**
    * How much performance impact was caused by a health event at a client location. For performance, this is the percentage of how much latency increased during the event compared to typical performance for traffic, from this client location to an Amazon Web Services location, using a specific client network.  For more information, see When Amazon Web Services creates and resolves health events in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var PercentOfClientLocationImpacted: js.UndefOr[Double] = js.undefined
  
  /**
    * How much performance impact was caused by a health event for total traffic globally. For performance, this is the percentage of how much latency increased during the event compared to typical performance for your application traffic globally.  For more information, see When Amazon Web Services creates and resolves health events in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var PercentOfTotalTrafficImpacted: js.UndefOr[Double] = js.undefined
  
  /**
    * This is the percentage of how much round-trip time increased during the event compared to typical round-trip time for your application for traffic.  For more information, see When Amazon Web Services creates and resolves health events in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var RoundTripTime: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.RoundTripTime] = js.undefined
}
object PerformanceMeasurement {
  
  inline def apply(): PerformanceMeasurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceMeasurement] (val x: Self) extends AnyVal {
    
    inline def setExperienceScore(value: Double): Self = StObject.set(x, "ExperienceScore", value.asInstanceOf[js.Any])
    
    inline def setExperienceScoreUndefined: Self = StObject.set(x, "ExperienceScore", js.undefined)
    
    inline def setPercentOfClientLocationImpacted(value: Double): Self = StObject.set(x, "PercentOfClientLocationImpacted", value.asInstanceOf[js.Any])
    
    inline def setPercentOfClientLocationImpactedUndefined: Self = StObject.set(x, "PercentOfClientLocationImpacted", js.undefined)
    
    inline def setPercentOfTotalTrafficImpacted(value: Double): Self = StObject.set(x, "PercentOfTotalTrafficImpacted", value.asInstanceOf[js.Any])
    
    inline def setPercentOfTotalTrafficImpactedUndefined: Self = StObject.set(x, "PercentOfTotalTrafficImpacted", js.undefined)
    
    inline def setRoundTripTime(value: RoundTripTime): Self = StObject.set(x, "RoundTripTime", value.asInstanceOf[js.Any])
    
    inline def setRoundTripTimeUndefined: Self = StObject.set(x, "RoundTripTime", js.undefined)
  }
}
