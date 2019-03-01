package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMC extends js.Object {
  var distance: scala.Double
  var lcode: java.lang.String
  var status: java.lang.String
}

object TMC {
  @scala.inline
  def apply(distance: scala.Double, lcode: java.lang.String, status: java.lang.String): TMC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("lcode")(lcode)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[TMC]
  }
}

