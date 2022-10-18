package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTransactionResult extends StObject {
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.TimingInformation] = js.undefined
  
  /**
    * The transaction ID of the started transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.TransactionId] = js.undefined
}
object StartTransactionResult {
  
  inline def apply(): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionResult]
  }
  
  extension [Self <: StartTransactionResult](x: Self) {
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
    
    inline def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
