package typings.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdhanMath extends js.Object {
  def degreesToRadians(degrees: Double): Double
  def normalizeToScale(number: Double, max: Double): Double
  def quadrantShiftAngle(angle: Double): Double
  def radiansToDegrees(radians: Double): Double
  def timeComponents(number: Double): Double
  def unwindAngle(angle: Double): Double
}

object AdhanMath {
  @scala.inline
  def apply(
    degreesToRadians: Double => Double,
    normalizeToScale: (Double, Double) => Double,
    quadrantShiftAngle: Double => Double,
    radiansToDegrees: Double => Double,
    timeComponents: Double => Double,
    unwindAngle: Double => Double
  ): AdhanMath = {
    val __obj = js.Dynamic.literal(degreesToRadians = js.Any.fromFunction1(degreesToRadians), normalizeToScale = js.Any.fromFunction2(normalizeToScale), quadrantShiftAngle = js.Any.fromFunction1(quadrantShiftAngle), radiansToDegrees = js.Any.fromFunction1(radiansToDegrees), timeComponents = js.Any.fromFunction1(timeComponents), unwindAngle = js.Any.fromFunction1(unwindAngle))
  
    __obj.asInstanceOf[AdhanMath]
  }
}

