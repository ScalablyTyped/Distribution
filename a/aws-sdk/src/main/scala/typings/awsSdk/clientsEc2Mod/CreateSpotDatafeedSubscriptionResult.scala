package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSpotDatafeedSubscriptionResult extends StObject {
  
  /**
    * The Spot Instance data feed subscription.
    */
  var SpotDatafeedSubscription: js.UndefOr[typings.awsSdk.clientsEc2Mod.SpotDatafeedSubscription] = js.undefined
}
object CreateSpotDatafeedSubscriptionResult {
  
  inline def apply(): CreateSpotDatafeedSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionResult]
  }
  
  extension [Self <: CreateSpotDatafeedSubscriptionResult](x: Self) {
    
    inline def setSpotDatafeedSubscription(value: SpotDatafeedSubscription): Self = StObject.set(x, "SpotDatafeedSubscription", value.asInstanceOf[js.Any])
    
    inline def setSpotDatafeedSubscriptionUndefined: Self = StObject.set(x, "SpotDatafeedSubscription", js.undefined)
  }
}
