package typings.athenajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object AnonX {
  @scala.inline
  def apply(x: Double, x2: Double, y: Double, y2: Double): AnonX = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

