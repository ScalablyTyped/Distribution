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
    val __obj = js.Dynamic.literal(distance = distance, lcode = lcode, status = status)
  
    __obj.asInstanceOf[TMC]
  }
}

