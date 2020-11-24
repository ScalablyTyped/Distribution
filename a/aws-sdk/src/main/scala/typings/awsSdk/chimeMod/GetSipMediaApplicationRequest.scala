package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationRequest extends js.Object {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString = js.native
}
object GetSipMediaApplicationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): GetSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationRequestOps[Self <: GetSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
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
    def setSipMediaApplicationId(value: NonEmptyString): Self = this.set("SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
