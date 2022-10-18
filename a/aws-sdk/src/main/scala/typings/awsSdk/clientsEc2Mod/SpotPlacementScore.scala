package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotPlacementScore extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The Region.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The placement score, on a scale from 1 to 10. A score of 10 indicates that your Spot request is highly likely to succeed in this Region or Availability Zone. A score of 1 indicates that your Spot request is not likely to succeed. 
    */
  var Score: js.UndefOr[Integer] = js.undefined
}
object SpotPlacementScore {
  
  inline def apply(): SpotPlacementScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotPlacementScore]
  }
  
  extension [Self <: SpotPlacementScore](x: Self) {
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setScore(value: Integer): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
