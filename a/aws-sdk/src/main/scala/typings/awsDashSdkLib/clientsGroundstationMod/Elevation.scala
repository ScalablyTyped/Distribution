package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elevation extends js.Object {
  /**
    * Elevation angle units.
    */
  var unit: AngleUnits
  /**
    * Elevation angle value.
    */
  var value: Double
}

object Elevation {
  @scala.inline
  def apply(unit: AngleUnits, value: Double): Elevation = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Elevation]
  }
}

