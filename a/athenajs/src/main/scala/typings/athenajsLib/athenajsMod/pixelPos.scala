package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pixelPos extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object pixelPos {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): pixelPos = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[pixelPos]
  }
}

