package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelProperties extends js.Object {
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchViewModelDefaultCreateOptions] = js.undefined
  /**
    * Default update options set for the SketchViewModel. Update options set on this property will be overridden by options passed to the [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchViewModelDefaultUpdateOptions] = js.undefined
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel. The SketchViewModel adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  /**
    * A  [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) used for representing the point geometry that is being drawn. [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) may also be used to symbolize point features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). However, it is recommended you use [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) instead.  The default value is the following:
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
  var pointSymbol: js.UndefOr[SimpleMarkerSymbolProperties | PointSymbol3DProperties] = js.undefined
  /**
    * A  [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) used for representing the polygon geometry that is being drawn. [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) may also be used to symbolize point features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). However, it is recommended you use [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) instead.  The default value is the following:
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
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties | PolygonSymbol3DProperties] = js.undefined
  /**
    * A  [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) or [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) used for representing the polyline geometry that is being drawn. [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) may also be used to symbolize polyline features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). However, it is recommended you use [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) instead.  The default value is the following:
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
  var polylineSymbol: js.UndefOr[SimpleLineSymbolProperties | LineSymbol3DProperties] = js.undefined
  /**
    * Indicates if a graphic can be selected to be updated. If `false`, graphics cannot selected to be updated. Set this property to `false` to add a custom [hitTest](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) logic for [updating](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateOnGraphicClick)
    */
  var updateOnGraphicClick: js.UndefOr[Boolean] = js.undefined
  /**
    * The view in which geometries will be sketched by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object SketchViewModelProperties {
  @scala.inline
  def apply(
    defaultCreateOptions: SketchViewModelDefaultCreateOptions = null,
    defaultUpdateOptions: SketchViewModelDefaultUpdateOptions = null,
    layer: GraphicsLayerProperties = null,
    pointSymbol: SimpleMarkerSymbolProperties | PointSymbol3DProperties = null,
    polygonSymbol: SimpleFillSymbolProperties | PolygonSymbol3DProperties = null,
    polylineSymbol: SimpleLineSymbolProperties | LineSymbol3DProperties = null,
    updateOnGraphicClick: js.UndefOr[Boolean] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null
  ): SketchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultCreateOptions != null) __obj.updateDynamic("defaultCreateOptions")(defaultCreateOptions.asInstanceOf[js.Any])
    if (defaultUpdateOptions != null) __obj.updateDynamic("defaultUpdateOptions")(defaultUpdateOptions.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (pointSymbol != null) __obj.updateDynamic("pointSymbol")(pointSymbol.asInstanceOf[js.Any])
    if (polygonSymbol != null) __obj.updateDynamic("polygonSymbol")(polygonSymbol.asInstanceOf[js.Any])
    if (polylineSymbol != null) __obj.updateDynamic("polylineSymbol")(polylineSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnGraphicClick)) __obj.updateDynamic("updateOnGraphicClick")(updateOnGraphicClick.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelProperties]
  }
}

