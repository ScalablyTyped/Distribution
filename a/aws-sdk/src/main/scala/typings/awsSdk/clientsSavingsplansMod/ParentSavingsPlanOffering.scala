package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentSavingsPlanOffering extends StObject {
  
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.undefined
  
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.undefined
  
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.undefined
  
  /**
    * The description.
    */
  var planDescription: js.UndefOr[SavingsPlanDescription] = js.undefined
  
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.undefined
}
object ParentSavingsPlanOffering {
  
  inline def apply(): ParentSavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentSavingsPlanOffering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentSavingsPlanOffering] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDurationSeconds(value: SavingsPlansDuration): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    inline def setOfferingId(value: UUID): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    inline def setPaymentOption(value: SavingsPlanPaymentOption): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    inline def setPlanDescription(value: SavingsPlanDescription): Self = StObject.set(x, "planDescription", value.asInstanceOf[js.Any])
    
    inline def setPlanDescriptionUndefined: Self = StObject.set(x, "planDescription", js.undefined)
    
    inline def setPlanType(value: SavingsPlanType): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    inline def setPlanTypeUndefined: Self = StObject.set(x, "planType", js.undefined)
  }
}
