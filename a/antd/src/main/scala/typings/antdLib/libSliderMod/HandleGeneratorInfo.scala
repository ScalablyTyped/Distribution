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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dragging")(dragging)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("rest")(rest)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[HandleGeneratorInfo]
  }
}

