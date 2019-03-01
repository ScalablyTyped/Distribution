package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapImageLayerLayerviewCreateEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object MapImageLayerLayerviewCreateEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): MapImageLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[MapImageLayerLayerviewCreateEvent]
  }
}

