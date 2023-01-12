package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionDescription extends StObject {
  
  /**
    * The time when the transaction committed or aborted, if it is not currently active.
    */
  var TransactionEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the transaction.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
  
  /**
    * The time when the transaction started.
    */
  var TransactionStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A status of ACTIVE, COMMITTED, or ABORTED.
    */
  var TransactionStatus: js.UndefOr[typings.awsSdk.clientsLakeformationMod.TransactionStatus] = js.undefined
}
object TransactionDescription {
  
  inline def apply(): TransactionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionDescription] (val x: Self) extends AnyVal {
    
    inline def setTransactionEndTime(value: js.Date): Self = StObject.set(x, "TransactionEndTime", value.asInstanceOf[js.Any])
    
    inline def setTransactionEndTimeUndefined: Self = StObject.set(x, "TransactionEndTime", js.undefined)
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
    
    inline def setTransactionStartTime(value: js.Date): Self = StObject.set(x, "TransactionStartTime", value.asInstanceOf[js.Any])
    
    inline def setTransactionStartTimeUndefined: Self = StObject.set(x, "TransactionStartTime", js.undefined)
    
    inline def setTransactionStatus(value: TransactionStatus): Self = StObject.set(x, "TransactionStatus", value.asInstanceOf[js.Any])
    
    inline def setTransactionStatusUndefined: Self = StObject.set(x, "TransactionStatus", js.undefined)
  }
}
