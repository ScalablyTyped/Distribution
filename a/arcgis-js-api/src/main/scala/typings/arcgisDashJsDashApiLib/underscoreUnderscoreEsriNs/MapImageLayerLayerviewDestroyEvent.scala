package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapImageLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object MapImageLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): MapImageLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[MapImageLayerLayerviewDestroyEvent]
  }
}

