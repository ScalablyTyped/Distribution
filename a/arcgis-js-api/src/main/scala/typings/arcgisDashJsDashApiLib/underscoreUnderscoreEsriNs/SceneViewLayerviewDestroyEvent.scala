package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewLayerviewDestroyEvent extends js.Object {
  var layer: Layer
  var layerView: LayerView
}

object SceneViewLayerviewDestroyEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): SceneViewLayerviewDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("layerView")(layerView)
    __obj.asInstanceOf[SceneViewLayerviewDestroyEvent]
  }
}

