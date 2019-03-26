package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsLayerView extends LayerView {
  /**
    * Highlights the given feature(s).
    * > **Known Limitations**  Currently the highlight method is only supported in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GraphicsLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): js.Any = js.native
  def highlight(target: Graphic): js.Any = js.native
  def highlight(target: js.Array[scala.Double | Graphic]): js.Any = js.native
  def highlight(target: scala.Double): js.Any = js.native
  /**
    * Returns all graphics available for drawing in the layer view as a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GraphicsLayerView.html#queryGraphics)
    *
    *
    */
  def queryGraphics(): Collection[Graphic] = js.native
}

@JSGlobal("__esri.GraphicsLayerView")
@js.native
/**
  * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GraphicsLayerView.html)
  */
class GraphicsLayerViewCls () extends GraphicsLayerView {
  def this(properties: GraphicsLayerViewProperties) = this()
}

