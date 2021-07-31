package typings.awsSdk.chimeMod

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
  
  @scala.inline
  def apply(): SipMediaApplicationCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationCall]
  }
  
  @scala.inline
  implicit class SipMediaApplicationCallMutableBuilder[Self <: SipMediaApplicationCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: GuidString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
