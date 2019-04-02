package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerViewGL2DProperties extends LayerViewProperties {
  /**
    * The WebGL rendering context associated to this layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#context)
    */
  var context: js.UndefOr[stdLib.WebGLRenderingContext | js.Any] = js.undefined
  /**
    * The array of [Tile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile) objects computed to cover the MapView's visible area. This array is updated when the view is animating or the user is interacting with it. Then if tiles have been added or removed, [tilesChanged()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged) is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tiles)
    */
  var tiles: js.UndefOr[js.Array[BaseLayerViewGL2DTile]] = js.undefined
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object BaseLayerViewGL2DProperties {
  @scala.inline
  def apply(
    context: stdLib.WebGLRenderingContext | js.Any = null,
    tiles: js.Array[BaseLayerViewGL2DTile] = null,
    view: MapViewProperties = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseLayerViewGL2DProperties = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BaseLayerViewGL2DProperties]
  }
}

