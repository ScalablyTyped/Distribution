package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SKPaymentTransactionState extends StObject
@JSGlobal("SKPaymentTransactionState")
@js.native
object SKPaymentTransactionState extends StObject {
  
  /**
    * A transaction that is in the queue, but its final status is pending external action such as Ask to Buy.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with SKPaymentTransactionState
  
  /**
    * A failed transaction.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with SKPaymentTransactionState
  
  /**
    * A successfully processed transaction.
    */
  @js.native
  sealed trait Purchased
    extends StObject
       with SKPaymentTransactionState
  
  /**
    * A transaction that is being processed by the App Store.
    */
  @js.native
  sealed trait Purchasing
    extends StObject
       with SKPaymentTransactionState
  
  /**
    * A transaction that restores content previously purchased by the user.
    */
  @js.native
  sealed trait Restored
    extends StObject
       with SKPaymentTransactionState
}
