package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDevicesResponse extends js.Object {
  /**
    * The devices that meet the specified set of filter criteria, in sort order.
    */
  var Devices: js.UndefOr[DeviceDataList] = js.native
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The total number of devices returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchDevicesResponse {
  @scala.inline
  def apply(): SearchDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDevicesResponse]
  }
  @scala.inline
  implicit class SearchDevicesResponseOps[Self <: SearchDevicesResponse] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: DeviceData*): Self = this.set("Devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: DeviceDataList): Self = this.set("Devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("Devices", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

