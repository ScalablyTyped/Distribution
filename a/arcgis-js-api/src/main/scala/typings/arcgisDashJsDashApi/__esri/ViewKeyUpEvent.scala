package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`key-up`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewKeyUpEvent extends js.Object {
  var key: String
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: `key-up`
}

object ViewKeyUpEvent {
  @scala.inline
  def apply(key: String, native: js.Any, stopPropagation: js.Function, timestamp: Double, `type`: `key-up`): ViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewKeyUpEvent]
  }
}

