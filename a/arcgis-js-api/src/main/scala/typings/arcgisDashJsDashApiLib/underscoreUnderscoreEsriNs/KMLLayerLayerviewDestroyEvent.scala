package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object KMLLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): KMLLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[KMLLayerLayerviewDestroyEvent]
  }
}

