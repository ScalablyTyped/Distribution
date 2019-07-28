package typings.antd.esSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleGeneratorInfo extends js.Object {
  var dragging: Boolean
  var index: Double
  var rest: js.Array[_]
  var value: Double
}

object HandleGeneratorInfo {
  @scala.inline
  def apply(dragging: Boolean, index: Double, rest: js.Array[_], value: Double): HandleGeneratorInfo = {
    val __obj = js.Dynamic.literal(dragging = dragging, index = index, rest = rest, value = value)
  
    __obj.asInstanceOf[HandleGeneratorInfo]
  }
}

