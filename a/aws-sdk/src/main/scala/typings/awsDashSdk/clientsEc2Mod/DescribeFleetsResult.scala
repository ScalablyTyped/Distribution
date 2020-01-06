package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetsResult extends js.Object {
  /**
    * Information about the EC2 Fleets.
    */
  var Fleets: js.UndefOr[FleetSet] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeFleetsResult {
  @scala.inline
  def apply(Fleets: FleetSet = null, NextToken: String = null): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    if (Fleets != null) __obj.updateDynamic("Fleets")(Fleets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetsResult]
  }
}

