package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerLayerviewDestroyEvent extends js.Object {
  var layerView: LayerView
  var view: View
}

object CSVLayerLayerviewDestroyEvent {
  @scala.inline
  def apply(layerView: LayerView, view: View): CSVLayerLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerView")(layerView)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[CSVLayerLayerviewDestroyEvent]
  }
}

