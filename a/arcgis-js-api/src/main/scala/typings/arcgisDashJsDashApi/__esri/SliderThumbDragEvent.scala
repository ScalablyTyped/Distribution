package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`thumb-drag`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.drag
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.start
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderThumbDragEvent extends js.Object {
  var index: Double
  var state: drag | start | stop
  var `type`: `thumb-drag`
  var value: Double
}

object SliderThumbDragEvent {
  @scala.inline
  def apply(index: Double, state: drag | start | stop, `type`: `thumb-drag`, value: Double): SliderThumbDragEvent = {
    val __obj = js.Dynamic.literal(index = index, state = state.asInstanceOf[js.Any], value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SliderThumbDragEvent]
  }
}

