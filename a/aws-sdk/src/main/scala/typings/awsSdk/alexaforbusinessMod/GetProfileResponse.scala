package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileResponse extends js.Object {
  /**
    * The details of the room profile requested. Required.
    */
  var Profile: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Profile] = js.native
}

object GetProfileResponse {
  @scala.inline
  def apply(): GetProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProfileResponse]
  }
  @scala.inline
  implicit class GetProfileResponseOps[Self <: GetProfileResponse] (val x: Self) extends AnyVal {
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
    def setProfile(value: Profile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
  }
  
}

