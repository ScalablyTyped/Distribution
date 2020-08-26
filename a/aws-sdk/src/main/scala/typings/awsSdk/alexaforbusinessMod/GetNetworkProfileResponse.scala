package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileResponse extends js.Object {
  /**
    * The network profile associated with a device.
    */
  var NetworkProfile: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NetworkProfile] = js.native
}

object GetNetworkProfileResponse {
  @scala.inline
  def apply(): GetNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkProfileResponse]
  }
  @scala.inline
  implicit class GetNetworkProfileResponseOps[Self <: GetNetworkProfileResponse] (val x: Self) extends AnyVal {
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
    def setNetworkProfile(value: NetworkProfile): Self = this.set("NetworkProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkProfile: Self = this.set("NetworkProfile", js.undefined)
  }
  
}

