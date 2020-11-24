package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProfileRequest extends js.Object {
  
  /**
    * The ARN of the room profile to delete. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}
object DeleteProfileRequest {
  
  @scala.inline
  def apply(): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteProfileRequestOps[Self <: DeleteProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProfileArn(value: Arn): Self = this.set("ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileArn: Self = this.set("ProfileArn", js.undefined)
  }
}
