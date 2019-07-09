package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object GeoJSONLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): GeoJSONLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[GeoJSONLayerLayerviewCreateErrorEvent]
  }
}

