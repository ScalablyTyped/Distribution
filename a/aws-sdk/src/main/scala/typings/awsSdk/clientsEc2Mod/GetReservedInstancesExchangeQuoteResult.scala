package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservedInstancesExchangeQuoteResult extends StObject {
  
  /**
    * The currency of the transaction.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the exchange is valid. If false, the exchange cannot be completed.
    */
  var IsValidExchange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new end date of the reservation term.
    */
  var OutputReservedInstancesWillExpireAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total true upfront charge for the exchange.
    */
  var PaymentDue: js.UndefOr[String] = js.undefined
  
  /**
    * The cost associated with the Reserved Instance.
    */
  var ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.undefined
  
  /**
    * The configuration of your Convertible Reserved Instances.
    */
  var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.undefined
  
  /**
    * The cost associated with the Reserved Instance.
    */
  var TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.undefined
  
  /**
    * The values of the target Convertible Reserved Instances.
    */
  var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.undefined
  
  /**
    * Describes the reason why the exchange cannot be completed.
    */
  var ValidationFailureReason: js.UndefOr[String] = js.undefined
}
object GetReservedInstancesExchangeQuoteResult {
  
  inline def apply(): GetReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteResult]
  }
  
  extension [Self <: GetReservedInstancesExchangeQuoteResult](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setIsValidExchange(value: Boolean): Self = StObject.set(x, "IsValidExchange", value.asInstanceOf[js.Any])
    
    inline def setIsValidExchangeUndefined: Self = StObject.set(x, "IsValidExchange", js.undefined)
    
    inline def setOutputReservedInstancesWillExpireAt(value: js.Date): Self = StObject.set(x, "OutputReservedInstancesWillExpireAt", value.asInstanceOf[js.Any])
    
    inline def setOutputReservedInstancesWillExpireAtUndefined: Self = StObject.set(x, "OutputReservedInstancesWillExpireAt", js.undefined)
    
    inline def setPaymentDue(value: String): Self = StObject.set(x, "PaymentDue", value.asInstanceOf[js.Any])
    
    inline def setPaymentDueUndefined: Self = StObject.set(x, "PaymentDue", js.undefined)
    
    inline def setReservedInstanceValueRollup(value: ReservationValue): Self = StObject.set(x, "ReservedInstanceValueRollup", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceValueRollupUndefined: Self = StObject.set(x, "ReservedInstanceValueRollup", js.undefined)
    
    inline def setReservedInstanceValueSet(value: ReservedInstanceReservationValueSet): Self = StObject.set(x, "ReservedInstanceValueSet", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceValueSetUndefined: Self = StObject.set(x, "ReservedInstanceValueSet", js.undefined)
    
    inline def setReservedInstanceValueSetVarargs(value: ReservedInstanceReservationValue*): Self = StObject.set(x, "ReservedInstanceValueSet", js.Array(value*))
    
    inline def setTargetConfigurationValueRollup(value: ReservationValue): Self = StObject.set(x, "TargetConfigurationValueRollup", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationValueRollupUndefined: Self = StObject.set(x, "TargetConfigurationValueRollup", js.undefined)
    
    inline def setTargetConfigurationValueSet(value: TargetReservationValueSet): Self = StObject.set(x, "TargetConfigurationValueSet", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationValueSetUndefined: Self = StObject.set(x, "TargetConfigurationValueSet", js.undefined)
    
    inline def setTargetConfigurationValueSetVarargs(value: TargetReservationValue*): Self = StObject.set(x, "TargetConfigurationValueSet", js.Array(value*))
    
    inline def setValidationFailureReason(value: String): Self = StObject.set(x, "ValidationFailureReason", value.asInstanceOf[js.Any])
    
    inline def setValidationFailureReasonUndefined: Self = StObject.set(x, "ValidationFailureReason", js.undefined)
  }
}
