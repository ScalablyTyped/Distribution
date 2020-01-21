package typings.antd.sliderMod

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
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandleGeneratorInfo]
  }
}

