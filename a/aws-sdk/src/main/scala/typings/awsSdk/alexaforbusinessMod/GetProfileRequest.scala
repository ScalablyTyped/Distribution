package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileRequest extends js.Object {
  /**
    * The ARN of the room profile for which to request details. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}

object GetProfileRequest {
  @scala.inline
  def apply(): GetProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileRequest]
  }
  @scala.inline
  implicit class GetProfileRequestOps[Self <: GetProfileRequest] (val x: Self) extends AnyVal {
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

