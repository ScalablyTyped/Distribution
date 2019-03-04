package typings
package antdLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleGeneratorInfo extends js.Object {
  var dragging: scala.Boolean
  var index: scala.Double
  var rest: js.Array[_]
  var value: scala.Double
}

object HandleGeneratorInfo {
  @scala.inline
  def apply(dragging: scala.Boolean, index: scala.Double, rest: js.Array[_], value: scala.Double): HandleGeneratorInfo = {
    val __obj = js.Dynamic.literal(dragging = dragging, index = index, rest = rest, value = value)
  
    __obj.asInstanceOf[HandleGeneratorInfo]
  }
}

