package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewKeyUpEvent extends js.Object {
  var key: String
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
}

object MapViewKeyUpEvent {
  @scala.inline
  def apply(key: String, native: js.Any, stopPropagation: js.Function, timestamp: Double, `type`: String): MapViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(key = key, native = native, stopPropagation = stopPropagation, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewKeyUpEvent]
  }
}

