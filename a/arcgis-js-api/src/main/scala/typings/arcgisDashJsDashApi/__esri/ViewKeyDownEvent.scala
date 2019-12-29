package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`key-down`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewKeyDownEvent extends js.Object {
  var key: String
  var native: js.Any
  var repeat: Boolean
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: `key-down`
}

object ViewKeyDownEvent {
  @scala.inline
  def apply(
    key: String,
    native: js.Any,
    repeat: Boolean,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `key-down`
  ): ViewKeyDownEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewKeyDownEvent]
  }
}

