package typings.adhan.mod

import typings.adhan.AnonAsr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var adjustments: AnonAsr
  var fajrAngle: Double
  var highLatitudeRule: HighLatitudeRule
  var ishaAngle: Double
  var ishaInterval: Double
  var madhab: Madhab
  val method: String
}

object Parameter {
  @scala.inline
  def apply(
    adjustments: AnonAsr,
    fajrAngle: Double,
    highLatitudeRule: HighLatitudeRule,
    ishaAngle: Double,
    ishaInterval: Double,
    madhab: Madhab,
    method: String
  ): Parameter = {
    val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], fajrAngle = fajrAngle.asInstanceOf[js.Any], highLatitudeRule = highLatitudeRule.asInstanceOf[js.Any], ishaAngle = ishaAngle.asInstanceOf[js.Any], ishaInterval = ishaInterval.asInstanceOf[js.Any], madhab = madhab.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

