package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderThumbDragEvent extends js.Object {
  var index: Double
  var state: String
  var `type`: String
  var value: Double
}

object ColorSizeSliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: String, `type`: String, value: Double): ColorSizeSliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index, state = state, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorSizeSliderThumbDragEvent]
  }
}

