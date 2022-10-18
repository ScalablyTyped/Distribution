package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLongTermPricingResult extends StObject {
  
  /**
    * The ID of the long-term pricing type for the device.
    */
  var LongTermPricingId: js.UndefOr[typings.awsSdk.clientsSnowballMod.LongTermPricingId] = js.undefined
}
object CreateLongTermPricingResult {
  
  inline def apply(): CreateLongTermPricingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLongTermPricingResult]
  }
  
  extension [Self <: CreateLongTermPricingResult](x: Self) {
    
    inline def setLongTermPricingId(value: LongTermPricingId): Self = StObject.set(x, "LongTermPricingId", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingIdUndefined: Self = StObject.set(x, "LongTermPricingId", js.undefined)
  }
}
