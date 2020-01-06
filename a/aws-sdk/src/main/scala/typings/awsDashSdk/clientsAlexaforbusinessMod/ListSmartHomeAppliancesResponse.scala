package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSmartHomeAppliancesResponse extends js.Object {
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.native
  /**
    * The smart home appliances.
    */
  var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.native
}

object ListSmartHomeAppliancesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SmartHomeAppliances: SmartHomeApplianceList = null): ListSmartHomeAppliancesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SmartHomeAppliances != null) __obj.updateDynamic("SmartHomeAppliances")(SmartHomeAppliances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSmartHomeAppliancesResponse]
  }
}

