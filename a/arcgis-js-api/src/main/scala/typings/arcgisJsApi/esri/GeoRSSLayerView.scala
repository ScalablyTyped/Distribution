package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRSSLayerView extends LayerView {
  /**
    * Highlights the given feature(s).
    * > **Known Limitations**  Currently the highlight method is only supported in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoRSSLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight.
    *
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Graphic]): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
}

