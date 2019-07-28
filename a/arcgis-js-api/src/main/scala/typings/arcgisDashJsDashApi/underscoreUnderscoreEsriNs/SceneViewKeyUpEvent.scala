package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewKeyUpEvent extends js.Object {
  var key: String
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: String
}

object SceneViewKeyUpEvent {
  @scala.inline
  def apply(key: String, native: js.Any, stopPropagation: js.Function, timestamp: Double, `type`: String): SceneViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(key = key, native = native, stopPropagation = stopPropagation, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneViewKeyUpEvent]
  }
}

