package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object in the payment queue.
  *
  * See https://developer.apple.com/documentation/storekit/skpaymenttransaction for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait SKPaymentTransaction extends StObject {
  
  /**
    * The transaction that was restored by the App Store.
    */
  var originalTransaction: js.UndefOr[SKPaymentTransaction] = js.undefined
  
  /**
    * The payment for the transaction.
    */
  var payment: SKPayment
  
  /**
    * The date the transaction was added to the App Store’s payment queue.
    */
  var transactionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string that uniquely identifies a successful payment transaction.
    */
  var transactionIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A signed receipt that records all information about a successful payment transaction.
    */
  var transactionReceipt: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The current state of the transaction.
    */
  var transactionState: SKPaymentTransactionState
}
object SKPaymentTransaction {
  
  inline def apply(payment: SKPayment, transactionState: SKPaymentTransactionState): SKPaymentTransaction = {
    val __obj = js.Dynamic.literal(payment = payment.asInstanceOf[js.Any], transactionState = transactionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SKPaymentTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SKPaymentTransaction] (val x: Self) extends AnyVal {
    
    inline def setOriginalTransaction(value: SKPaymentTransaction): Self = StObject.set(x, "originalTransaction", value.asInstanceOf[js.Any])
    
    inline def setOriginalTransactionUndefined: Self = StObject.set(x, "originalTransaction", js.undefined)
    
    inline def setPayment(value: SKPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setTransactionDate(value: js.Date): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
    
    inline def setTransactionDateUndefined: Self = StObject.set(x, "transactionDate", js.undefined)
    
    inline def setTransactionIdentifier(value: String): Self = StObject.set(x, "transactionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdentifierUndefined: Self = StObject.set(x, "transactionIdentifier", js.undefined)
    
    inline def setTransactionReceipt(value: js.Object): Self = StObject.set(x, "transactionReceipt", value.asInstanceOf[js.Any])
    
    inline def setTransactionReceiptUndefined: Self = StObject.set(x, "transactionReceipt", js.undefined)
    
    inline def setTransactionState(value: SKPaymentTransactionState): Self = StObject.set(x, "transactionState", value.asInstanceOf[js.Any])
  }
}
