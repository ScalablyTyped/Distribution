package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewKeyUpEvent extends js.Object {
  var native: js.Any
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
}

object MapViewKeyUpEvent {
  @scala.inline
  def apply(native: js.Any, stopPropagation: js.Function, timestamp: scala.Double, `type`: java.lang.String): MapViewKeyUpEvent = {
    val __obj = js.Dynamic.literal(native = native, stopPropagation = stopPropagation, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapViewKeyUpEvent]
  }
}

