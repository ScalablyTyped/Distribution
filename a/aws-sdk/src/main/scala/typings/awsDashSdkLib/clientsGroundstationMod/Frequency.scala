package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frequency extends js.Object {
  /**
    * Frequency units.
    */
  var units: FrequencyUnits
  /**
    * Frequency value.
    */
  var value: Double
}

object Frequency {
  @scala.inline
  def apply(units: FrequencyUnits, value: Double): Frequency = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Frequency]
  }
}

