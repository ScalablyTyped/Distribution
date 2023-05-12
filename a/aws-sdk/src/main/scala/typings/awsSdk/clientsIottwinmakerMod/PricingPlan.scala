package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingPlan extends StObject {
  
  /**
    * The billable entity count.
    */
  var billableEntityCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The pricing plan's bundle information.
    */
  var bundleInformation: js.UndefOr[BundleInformation] = js.undefined
  
  /**
    * The effective date and time of the pricing plan.
    */
  var effectiveDateTime: js.Date
  
  /**
    * The pricing mode.
    */
  var pricingMode: PricingMode
  
  /**
    * The set date and time for updating a pricing plan.
    */
  var updateDateTime: js.Date
  
  /**
    * The update reason for changing a pricing plan.
    */
  var updateReason: UpdateReason
}
object PricingPlan {
  
  inline def apply(
    effectiveDateTime: js.Date,
    pricingMode: PricingMode,
    updateDateTime: js.Date,
    updateReason: UpdateReason
  ): PricingPlan = {
    val __obj = js.Dynamic.literal(effectiveDateTime = effectiveDateTime.asInstanceOf[js.Any], pricingMode = pricingMode.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], updateReason = updateReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PricingPlan] (val x: Self) extends AnyVal {
    
    inline def setBillableEntityCount(value: Long): Self = StObject.set(x, "billableEntityCount", value.asInstanceOf[js.Any])
    
    inline def setBillableEntityCountUndefined: Self = StObject.set(x, "billableEntityCount", js.undefined)
    
    inline def setBundleInformation(value: BundleInformation): Self = StObject.set(x, "bundleInformation", value.asInstanceOf[js.Any])
    
    inline def setBundleInformationUndefined: Self = StObject.set(x, "bundleInformation", js.undefined)
    
    inline def setEffectiveDateTime(value: js.Date): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setPricingMode(value: PricingMode): Self = StObject.set(x, "pricingMode", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateReason(value: UpdateReason): Self = StObject.set(x, "updateReason", value.asInstanceOf[js.Any])
  }
}
