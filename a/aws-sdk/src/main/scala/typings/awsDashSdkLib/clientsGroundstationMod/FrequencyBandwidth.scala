package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrequencyBandwidth extends js.Object {
  /**
    * Frequency bandwidth units.
    */
  var units: BandwidthUnits
  /**
    * Frequency bandwidth value.
    */
  var value: Double
}

object FrequencyBandwidth {
  @scala.inline
  def apply(units: BandwidthUnits, value: Double): FrequencyBandwidth = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[FrequencyBandwidth]
  }
}

