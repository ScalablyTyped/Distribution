package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTileLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object WebTileLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): WebTileLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[WebTileLayerLayerviewDestroyEvent]
  }
}

