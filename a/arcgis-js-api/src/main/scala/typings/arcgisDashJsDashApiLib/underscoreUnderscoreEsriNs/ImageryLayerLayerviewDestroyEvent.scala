package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object ImageryLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): ImageryLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ImageryLayerLayerviewDestroyEvent]
  }
}

