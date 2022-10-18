package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLongTermPricingRequest extends StObject {
  
  /**
    * If set to true, specifies that the current long-term pricing type for the device should be automatically renewed before the long-term pricing contract expires.
    */
  var IsLongTermPricingAutoRenew: js.UndefOr[JavaBoolean] = js.undefined
  
  /**
    * The ID of the long-term pricing type for the device.
    */
  var LongTermPricingId: typings.awsSdk.clientsSnowballMod.LongTermPricingId
  
  /**
    * Specifies that a device that is ordered with long-term pricing should be replaced with a new device.
    */
  var ReplacementJob: js.UndefOr[JobId] = js.undefined
}
object UpdateLongTermPricingRequest {
  
  inline def apply(LongTermPricingId: LongTermPricingId): UpdateLongTermPricingRequest = {
    val __obj = js.Dynamic.literal(LongTermPricingId = LongTermPricingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLongTermPricingRequest]
  }
  
  extension [Self <: UpdateLongTermPricingRequest](x: Self) {
    
    inline def setIsLongTermPricingAutoRenew(value: JavaBoolean): Self = StObject.set(x, "IsLongTermPricingAutoRenew", value.asInstanceOf[js.Any])
    
    inline def setIsLongTermPricingAutoRenewUndefined: Self = StObject.set(x, "IsLongTermPricingAutoRenew", js.undefined)
    
    inline def setLongTermPricingId(value: LongTermPricingId): Self = StObject.set(x, "LongTermPricingId", value.asInstanceOf[js.Any])
    
    inline def setReplacementJob(value: JobId): Self = StObject.set(x, "ReplacementJob", value.asInstanceOf[js.Any])
    
    inline def setReplacementJobUndefined: Self = StObject.set(x, "ReplacementJob", js.undefined)
  }
}
