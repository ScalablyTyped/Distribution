package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetsResult extends js.Object {
  /**
    * Information about the fleets.
    */
  var Fleets: js.UndefOr[FleetList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeFleetsResult {
  @scala.inline
  def apply(Fleets: FleetList = null, NextToken: String = null): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    if (Fleets != null) __obj.updateDynamic("Fleets")(Fleets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetsResult]
  }
}

