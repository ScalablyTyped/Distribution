package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locations extends js.Object {
  /**
    * The locations.
    */
  var locations: js.UndefOr[LocationList] = js.undefined
}

object Locations {
  @scala.inline
  def apply(locations: LocationList = null): Locations = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[Locations]
  }
}

