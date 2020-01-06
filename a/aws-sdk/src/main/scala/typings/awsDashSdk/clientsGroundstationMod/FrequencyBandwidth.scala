package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrequencyBandwidth extends js.Object {
  /**
    * Frequency bandwidth units.
    */
  var units: BandwidthUnits = js.native
  /**
    * Frequency bandwidth value.
    */
  var value: Double = js.native
}

object FrequencyBandwidth {
  @scala.inline
  def apply(units: BandwidthUnits, value: Double): FrequencyBandwidth = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrequencyBandwidth]
  }
}

