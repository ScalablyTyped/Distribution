package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownDegrees extends js.Object {
  var downDegrees: scala.Double
  var leftDegrees: scala.Double
  var rightDegrees: scala.Double
  var upDegrees: scala.Double
}

object Anon_DownDegrees {
  @scala.inline
  def apply(
    downDegrees: scala.Double,
    leftDegrees: scala.Double,
    rightDegrees: scala.Double,
    upDegrees: scala.Double
  ): Anon_DownDegrees = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downDegrees")(downDegrees)
    __obj.updateDynamic("leftDegrees")(leftDegrees)
    __obj.updateDynamic("rightDegrees")(rightDegrees)
    __obj.updateDynamic("upDegrees")(upDegrees)
    __obj.asInstanceOf[Anon_DownDegrees]
  }
}

