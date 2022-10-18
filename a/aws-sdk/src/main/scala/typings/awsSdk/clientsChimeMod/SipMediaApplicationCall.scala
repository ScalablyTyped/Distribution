package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipMediaApplicationCall extends StObject {
  
  /**
    * The transaction ID of a call.
    */
  var TransactionId: js.UndefOr[GuidString] = js.undefined
}
object SipMediaApplicationCall {
  
  inline def apply(): SipMediaApplicationCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationCall]
  }
  
  extension [Self <: SipMediaApplicationCall](x: Self) {
    
    inline def setTransactionId(value: GuidString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
