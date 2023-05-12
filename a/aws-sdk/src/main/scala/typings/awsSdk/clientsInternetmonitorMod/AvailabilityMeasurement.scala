package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityMeasurement extends StObject {
  
  /**
    * Experience scores, or health scores are calculated for different geographic and network provider combinations (that is, different granularities) and also summed into global scores. If you view performance or availability scores without filtering for any specific geography or service provider, Amazon CloudWatch Internet Monitor provides global health scores. The Amazon CloudWatch Internet Monitor chapter in the CloudWatch User Guide includes detailed information about how Internet Monitor calculates health scores, including performance and availability scores, and when it creates and resolves health events. For more information, see How Amazon Web Services calculates performance and availability scores in the Amazon CloudWatch Internet Monitor section of the CloudWatch User Guide.
    */
  var ExperienceScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The percentage of impact caused by a health event for client location traffic globally. For information about how Internet Monitor calculates impact, see Inside Internet Monitor in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User Guide.
    */
  var PercentOfClientLocationImpacted: js.UndefOr[Double] = js.undefined
  
  /**
    * The percentage of impact caused by a health event for total traffic globally. For information about how Internet Monitor calculates impact, see Inside Internet Monitor in the Amazon CloudWatch Internet Monitor section of the Amazon CloudWatch User Guide.
    */
  var PercentOfTotalTrafficImpacted: js.UndefOr[Double] = js.undefined
}
object AvailabilityMeasurement {
  
  inline def apply(): AvailabilityMeasurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailabilityMeasurement] (val x: Self) extends AnyVal {
    
    inline def setExperienceScore(value: Double): Self = StObject.set(x, "ExperienceScore", value.asInstanceOf[js.Any])
    
    inline def setExperienceScoreUndefined: Self = StObject.set(x, "ExperienceScore", js.undefined)
    
    inline def setPercentOfClientLocationImpacted(value: Double): Self = StObject.set(x, "PercentOfClientLocationImpacted", value.asInstanceOf[js.Any])
    
    inline def setPercentOfClientLocationImpactedUndefined: Self = StObject.set(x, "PercentOfClientLocationImpacted", js.undefined)
    
    inline def setPercentOfTotalTrafficImpacted(value: Double): Self = StObject.set(x, "PercentOfTotalTrafficImpacted", value.asInstanceOf[js.Any])
    
    inline def setPercentOfTotalTrafficImpactedUndefined: Self = StObject.set(x, "PercentOfTotalTrafficImpacted", js.undefined)
  }
}
