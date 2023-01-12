package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstance extends StObject {
  
  /**
    * The unique identifier of the billing subscription.
    */
  var BillingSubscriptionId: js.UndefOr[Long] = js.undefined
  
  /**
    * The currency code for the offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The duration, in seconds, for which the OpenSearch instance is reserved.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The upfront fixed charge you will paid to purchase the specific Reserved Instance offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of OpenSearch instances that have been reserved.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The OpenSearch instance type offered by theReserved Instance offering.
    */
  var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * The payment option as defined in the Reserved Instance offering.
    */
  var PaymentOption: js.UndefOr[ReservedInstancePaymentOption] = js.undefined
  
  /**
    * The recurring charge to your account, regardless of whether you create any domains using the Reserved Instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * The customer-specified identifier to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.undefined
  
  /**
    * The unique identifier for the reservation.
    */
  var ReservedInstanceId: js.UndefOr[GUID] = js.undefined
  
  /**
    * The unique identifier of the Reserved Instance offering.
    */
  var ReservedInstanceOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the reservation was purchased.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the Reserved Instance.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The hourly rate at which you're charged for the domain using this Reserved Instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}
object ReservedInstance {
  
  inline def apply(): ReservedInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedInstance] (val x: Self) extends AnyVal {
    
    inline def setBillingSubscriptionId(value: Long): Self = StObject.set(x, "BillingSubscriptionId", value.asInstanceOf[js.Any])
    
    inline def setBillingSubscriptionIdUndefined: Self = StObject.set(x, "BillingSubscriptionId", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setPaymentOption(value: ReservedInstancePaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservationNameUndefined: Self = StObject.set(x, "ReservationName", js.undefined)
    
    inline def setReservedInstanceId(value: GUID): Self = StObject.set(x, "ReservedInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceIdUndefined: Self = StObject.set(x, "ReservedInstanceId", js.undefined)
    
    inline def setReservedInstanceOfferingId(value: String): Self = StObject.set(x, "ReservedInstanceOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceOfferingIdUndefined: Self = StObject.set(x, "ReservedInstanceOfferingId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    inline def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
