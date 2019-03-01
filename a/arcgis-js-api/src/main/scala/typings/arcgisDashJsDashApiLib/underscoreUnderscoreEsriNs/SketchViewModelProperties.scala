package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelProperties extends js.Object {
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel. The SketchViewModel adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  /**
    * A simple marker symbol used for representing the point geometry that is being drawn.  The default value is the following:
    * ```js
    * {
    *   type: "simple-marker",
    *   style: "circle",
    *   size: 6,
    *   color: [255, 255, 255],
    *   outline: {
    *    color: [50, 50, 50],
    *     width: 1
    *   }
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[SimpleMarkerSymbolProperties] = js.undefined
  /**
    * A simple fill symbol used for representing the polygon geometry that is being drawn.  The default value is the following:
    * ```js
    * {
    *   type: "simple-fill",
    *   color: [150, 150, 150, 0.2],
    *   outline: {
    *    color: [50, 50, 50],
    *     width: 2
    *   }
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties] = js.undefined
  /**
    * A simple line symbol used for representing the polyline geometry that is being drawn.  The default value is the following:
    * ```js
    * {
    *   type: "simple-line",
    *   color: [130, 130, 130],
    *   width: 2
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  /**
    * Indicates if a graphic can be selected to be updated. If `false`, graphics cannot selected to be updated. Set this property to `false` to add a custom [hitTest](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) logic for [updating](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateOnGraphicClick)
    */
  var updateOnGraphicClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The view in which geometries will be sketched by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object SketchViewModelProperties {
  @scala.inline
  def apply(
    layer: GraphicsLayerProperties = null,
    pointSymbol: SimpleMarkerSymbolProperties = null,
    polygonSymbol: SimpleFillSymbolProperties = null,
    polylineSymbol: SimpleLineSymbolProperties = null,
    updateOnGraphicClick: js.UndefOr[scala.Boolean] = js.undefined,
    view: MapViewProperties = null
  ): SketchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(pointSymbol)
    if (polygonSymbol != null) __obj.updateDynamic("polygonSymbol")(polygonSymbol)
    if (polylineSymbol != null) __obj.updateDynamic("polylineSymbol")(polylineSymbol)
    if (!js.isUndefined(updateOnGraphicClick)) __obj.updateDynamic("updateOnGraphicClick")(updateOnGraphicClick)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SketchViewModelProperties]
  }
}

