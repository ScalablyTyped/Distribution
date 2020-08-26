package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSmartHomeAppliancesResponse extends js.Object {
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The smart home appliances.
    */
  var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.native
}

object ListSmartHomeAppliancesResponse {
  @scala.inline
  def apply(): ListSmartHomeAppliancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmartHomeAppliancesResponse]
  }
  @scala.inline
  implicit class ListSmartHomeAppliancesResponseOps[Self <: ListSmartHomeAppliancesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSmartHomeAppliancesVarargs(value: SmartHomeAppliance*): Self = this.set("SmartHomeAppliances", js.Array(value :_*))
    @scala.inline
    def setSmartHomeAppliances(value: SmartHomeApplianceList): Self = this.set("SmartHomeAppliances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartHomeAppliances: Self = this.set("SmartHomeAppliances", js.undefined)
  }
  
}

