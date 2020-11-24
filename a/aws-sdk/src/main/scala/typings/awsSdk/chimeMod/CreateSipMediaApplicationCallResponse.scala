package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipMediaApplicationCallResponse extends js.Object {
  
  /**
    * The actual call.
    */
  var SipMediaApplicationCall: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplicationCall] = js.native
}
object CreateSipMediaApplicationCallResponse {
  
  @scala.inline
  def apply(): CreateSipMediaApplicationCallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipMediaApplicationCallResponse]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationCallResponseOps[Self <: CreateSipMediaApplicationCallResponse] (val x: Self) extends AnyVal {
    
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
    def setSipMediaApplicationCall(value: SipMediaApplicationCall): Self = this.set("SipMediaApplicationCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipMediaApplicationCall: Self = this.set("SipMediaApplicationCall", js.undefined)
  }
}
