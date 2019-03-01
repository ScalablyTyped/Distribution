package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object BingMapsLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): BingMapsLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[BingMapsLayerLayerviewCreateEvent]
  }
}

