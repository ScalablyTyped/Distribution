package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewKeyDownEvent extends js.Object {
  var key: String
  var native: js.Any
  var repeat: Boolean
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
}

object MapViewKeyDownEvent {
  @scala.inline
  def apply(
    key: String,
    native: js.Any,
    repeat: Boolean,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: String
  ): MapViewKeyDownEvent = {
    val __obj = js.Dynamic.literal(key = key, native = native, repeat = repeat, stopPropagation = stopPropagation, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewKeyDownEvent]
  }
}

