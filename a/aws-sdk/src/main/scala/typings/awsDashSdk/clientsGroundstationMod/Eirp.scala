package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eirp extends js.Object {
  /**
    * Units of an EIRP.
    */
  var units: EirpUnits
  /**
    * Value of an EIRP.
    */
  var value: Double
}

object Eirp {
  @scala.inline
  def apply(units: EirpUnits, value: Double): Eirp = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Eirp]
  }
}

