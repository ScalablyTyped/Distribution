package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstanceOffering extends StObject {
  
  /**
    * The currency code for the Reserved Instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The duration, in seconds, for which the offering will reserve the OpenSearch instance.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The upfront fixed charge you will pay to purchase the specific Reserved Instance offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The OpenSearch instance type offered by the Reserved Instance offering.
    */
  var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * Payment option for the Reserved Instance offering
    */
  var PaymentOption: js.UndefOr[ReservedInstancePaymentOption] = js.undefined
  
  /**
    * The recurring charge to your account, regardless of whether you creates any domains using the offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * The unique identifier of the Reserved Instance offering.
    */
  var ReservedInstanceOfferingId: js.UndefOr[GUID] = js.undefined
  
  /**
    * The hourly rate at which you're charged for the domain using this Reserved Instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}
object ReservedInstanceOffering {
  
  inline def apply(): ReservedInstanceOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstanceOffering]
  }
  
  extension [Self <: ReservedInstanceOffering](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setPaymentOption(value: ReservedInstancePaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservedInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedInstanceOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceOfferingIdUndefined: Self = StObject.set(x, "ReservedInstanceOfferingId", js.undefined)
    
    inline def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    inline def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
