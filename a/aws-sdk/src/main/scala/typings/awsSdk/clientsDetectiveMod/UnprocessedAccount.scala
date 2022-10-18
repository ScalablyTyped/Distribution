package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedAccount extends StObject {
  
  /**
    * The Amazon Web Services account identifier of the member account that was not processed.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsDetectiveMod.AccountId] = js.undefined
  
  /**
    * The reason that the member account request could not be processed.
    */
  var Reason: js.UndefOr[UnprocessedReason] = js.undefined
}
object UnprocessedAccount {
  
  inline def apply(): UnprocessedAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedAccount]
  }
  
  extension [Self <: UnprocessedAccount](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setReason(value: UnprocessedReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
