package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMC extends js.Object {
  var distance: Double
  var lcode: String
  var status: String
}

object TMC {
  @scala.inline
  def apply(distance: Double, lcode: String, status: String): TMC = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], lcode = lcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TMC]
  }
}

