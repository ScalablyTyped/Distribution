package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLongTermPricingRequest extends StObject {
  
  /**
    * Specifies whether the current long-term pricing type for the device should be renewed.
    */
  var IsLongTermPricingAutoRenew: js.UndefOr[JavaBoolean] = js.undefined
  
  /**
    * The type of long-term pricing option you want for the device, either 1-year or 3-year long-term pricing.
    */
  var LongTermPricingType: typings.awsSdk.clientsSnowballMod.LongTermPricingType
  
  /**
    * The type of Snow Family devices to use for the long-term pricing job.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.clientsSnowballMod.SnowballType] = js.undefined
}
object CreateLongTermPricingRequest {
  
  inline def apply(LongTermPricingType: LongTermPricingType): CreateLongTermPricingRequest = {
    val __obj = js.Dynamic.literal(LongTermPricingType = LongTermPricingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLongTermPricingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLongTermPricingRequest] (val x: Self) extends AnyVal {
    
    inline def setIsLongTermPricingAutoRenew(value: JavaBoolean): Self = StObject.set(x, "IsLongTermPricingAutoRenew", value.asInstanceOf[js.Any])
    
    inline def setIsLongTermPricingAutoRenewUndefined: Self = StObject.set(x, "IsLongTermPricingAutoRenew", js.undefined)
    
    inline def setLongTermPricingType(value: LongTermPricingType): Self = StObject.set(x, "LongTermPricingType", value.asInstanceOf[js.Any])
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
  }
}
