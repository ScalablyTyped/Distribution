package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipMediaApplicationCall extends js.Object {
  
  /**
    * The transaction ID of a call.
    */
  var TransactionId: js.UndefOr[GuidString] = js.native
}
object SipMediaApplicationCall {
  
  @scala.inline
  def apply(): SipMediaApplicationCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationCall]
  }
  
  @scala.inline
  implicit class SipMediaApplicationCallOps[Self <: SipMediaApplicationCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransactionId(value: GuidString): Self = this.set("TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("TransactionId", js.undefined)
  }
}
