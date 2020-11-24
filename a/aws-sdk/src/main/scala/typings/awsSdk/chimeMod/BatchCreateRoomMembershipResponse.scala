package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateRoomMembershipResponse extends js.Object {
  
  /**
    * If the action fails for one or more of the member IDs in the request, a list of the member IDs is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[MemberErrorList] = js.native
}
object BatchCreateRoomMembershipResponse {
  
  @scala.inline
  def apply(): BatchCreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateRoomMembershipResponse]
  }
  
  @scala.inline
  implicit class BatchCreateRoomMembershipResponseOps[Self <: BatchCreateRoomMembershipResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: MemberError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: MemberErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
