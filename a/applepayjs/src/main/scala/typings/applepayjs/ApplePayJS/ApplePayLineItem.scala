package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a line item in a payment request - for example, total, tax, discount, or grand total.
  */
trait ApplePayLineItem extends StObject {
  
  /**
    * The line item's amount.
    */
  var amount: String
  
  /**
    * The balance an account reaches before the merchant applies the automatic reload amount.
    */
  var automaticReloadPaymentThresholdAmount: js.UndefOr[String] = js.undefined
  
  /**
    * The [ISO 8601 formatted] date, in the future, of the payment.
    */
  var deferredPaymentDate: js.UndefOr[String] = js.undefined
  
  /**
    * A short, localized description of the line item.
    */
  var label: String
  
  /**
    * The time that the payment occurs as part of a successful transaction.
    */
  var paymentTiming: js.UndefOr[ApplePayPaymentTiming] = js.undefined
  
  /**
    * The [ISO 8601 formatted] date of the final payment.
    *
    */
  var recurringPaymentEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The number of interval units that make up the total payment interval.
    */
  var recurringPaymentIntervalCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time — in calendar units, such as day, month, or year — that represents a fraction of the total payment interval.
    */
  var recurringPaymentIntervalUnit: js.UndefOr[ApplePayRecurringPaymentDateUnit] = js.undefined
  
  /**
    * The [ISO 8601 formatted] date of the first payment.
    */
  var recurringPaymentStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates if the line item is final or pending.
    */
  var `type`: js.UndefOr[ApplePayLineItemType] = js.undefined
}
object ApplePayLineItem {
  
  inline def apply(amount: String, label: String): ApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayLineItem] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAutomaticReloadPaymentThresholdAmount(value: String): Self = StObject.set(x, "automaticReloadPaymentThresholdAmount", value.asInstanceOf[js.Any])
    
    inline def setAutomaticReloadPaymentThresholdAmountUndefined: Self = StObject.set(x, "automaticReloadPaymentThresholdAmount", js.undefined)
    
    inline def setDeferredPaymentDate(value: String): Self = StObject.set(x, "deferredPaymentDate", value.asInstanceOf[js.Any])
    
    inline def setDeferredPaymentDateUndefined: Self = StObject.set(x, "deferredPaymentDate", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPaymentTiming(value: ApplePayPaymentTiming): Self = StObject.set(x, "paymentTiming", value.asInstanceOf[js.Any])
    
    inline def setPaymentTimingUndefined: Self = StObject.set(x, "paymentTiming", js.undefined)
    
    inline def setRecurringPaymentEndDate(value: String): Self = StObject.set(x, "recurringPaymentEndDate", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentEndDateUndefined: Self = StObject.set(x, "recurringPaymentEndDate", js.undefined)
    
    inline def setRecurringPaymentIntervalCount(value: Double): Self = StObject.set(x, "recurringPaymentIntervalCount", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentIntervalCountUndefined: Self = StObject.set(x, "recurringPaymentIntervalCount", js.undefined)
    
    inline def setRecurringPaymentIntervalUnit(value: ApplePayRecurringPaymentDateUnit): Self = StObject.set(x, "recurringPaymentIntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentIntervalUnitUndefined: Self = StObject.set(x, "recurringPaymentIntervalUnit", js.undefined)
    
    inline def setRecurringPaymentStartDate(value: String): Self = StObject.set(x, "recurringPaymentStartDate", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentStartDateUndefined: Self = StObject.set(x, "recurringPaymentStartDate", js.undefined)
    
    inline def setType(value: ApplePayLineItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
