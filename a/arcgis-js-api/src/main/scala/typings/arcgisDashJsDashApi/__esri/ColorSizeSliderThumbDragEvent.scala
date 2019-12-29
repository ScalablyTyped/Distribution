package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-drag`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.drag
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSizeSliderThumbDragEvent extends js.Object {
  var index: Double
  var state: start | drag
  var `type`: `thumb-drag`
  var value: Double
}

object ColorSizeSliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: start | drag, `type`: `thumb-drag`, value: Double): ColorSizeSliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSizeSliderThumbDragEvent]
  }
}

