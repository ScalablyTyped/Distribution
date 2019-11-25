package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pixelPos extends js.Object {
  var x: Double
  var y: Double
}

object pixelPos {
  @scala.inline
  def apply(x: Double, y: Double): pixelPos = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pixelPos]
  }
}

