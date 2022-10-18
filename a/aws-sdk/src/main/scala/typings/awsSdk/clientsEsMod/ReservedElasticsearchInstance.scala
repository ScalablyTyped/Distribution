package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedElasticsearchInstance extends StObject {
  
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The duration, in seconds, for which the Elasticsearch instance is reserved.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of Elasticsearch instances that have been reserved.
    */
  var ElasticsearchInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
  
  /**
    * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The payment option as defined in the reserved Elasticsearch instance offering.
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined
  
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * The customer-specified identifier to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.undefined
  
  /**
    * The unique identifier for the reservation.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
  
  /**
    * The offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the reserved Elasticsearch instance.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The rate you are charged for each hour for the domain that is using this reserved instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}
object ReservedElasticsearchInstance {
  
  inline def apply(): ReservedElasticsearchInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedElasticsearchInstance]
  }
  
  extension [Self <: ReservedElasticsearchInstance](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setElasticsearchInstanceCount(value: Integer): Self = StObject.set(x, "ElasticsearchInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchInstanceCountUndefined: Self = StObject.set(x, "ElasticsearchInstanceCount", js.undefined)
    
    inline def setElasticsearchInstanceType(value: ESPartitionInstanceType): Self = StObject.set(x, "ElasticsearchInstanceType", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchInstanceTypeUndefined: Self = StObject.set(x, "ElasticsearchInstanceType", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setPaymentOption(value: ReservedElasticsearchInstancePaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservationNameUndefined: Self = StObject.set(x, "ReservationName", js.undefined)
    
    inline def setReservedElasticsearchInstanceId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstanceIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceId", js.undefined)
    
    inline def setReservedElasticsearchInstanceOfferingId(value: String): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstanceOfferingIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceOfferingId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    inline def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
