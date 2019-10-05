package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerLatency extends js.Object {
  /**
    * Amount of time that represents the time lag experienced by the player when connected to the specified region.
    */
  var LatencyInMilliseconds: js.UndefOr[Float] = js.undefined
  /**
    * Unique identifier for a player associated with the latency data.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Name of the region that is associated with the latency value.
    */
  var RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object PlayerLatency {
  @scala.inline
  def apply(
    LatencyInMilliseconds: Int | scala.Double = null,
    PlayerId: NonZeroAndMaxString = null,
    RegionIdentifier: NonZeroAndMaxString = null
  ): PlayerLatency = {
    val __obj = js.Dynamic.literal()
    if (LatencyInMilliseconds != null) __obj.updateDynamic("LatencyInMilliseconds")(LatencyInMilliseconds.asInstanceOf[js.Any])
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId)
    if (RegionIdentifier != null) __obj.updateDynamic("RegionIdentifier")(RegionIdentifier)
    __obj.asInstanceOf[PlayerLatency]
  }
}

