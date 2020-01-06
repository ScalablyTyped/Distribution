package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLocationsResponse extends js.Object {
  /**
    * An array that contains a list of locations.
    */
  var Locations: js.UndefOr[LocationList] = js.native
  /**
    * An opaque string that indicates the position at which to begin returning the next list of locations.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.NextToken] = js.native
}

object ListLocationsResponse {
  @scala.inline
  def apply(Locations: LocationList = null, NextToken: NextToken = null): ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Locations != null) __obj.updateDynamic("Locations")(Locations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocationsResponse]
  }
}

