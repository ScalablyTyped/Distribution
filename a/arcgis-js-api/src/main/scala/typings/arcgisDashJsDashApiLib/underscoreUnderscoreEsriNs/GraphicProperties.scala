package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicProperties extends js.Object {
  /**
    * Name-value pairs of fields and field values associated with the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes)
    */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /**
    * The geometry that defines the graphic's location.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * If applicable, references the layer in which the graphic is stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.undefined
  /**
    * The template for displaying content in a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when the graphic is selected. The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) may be used to access a graphic's [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes) and display their values in the view's default popup. See the documentation for [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for details on how to display attribute values in the popup.  As of 4.8 to get the actual `popupTemplate` of the graphic, see the [getEffectivePopupTemplate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getEffectivePopupTemplate) method that either returns this value or the `popupTemplate` of the graphic's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  /**
    * The [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the graphic. Choosing a symbol for a graphic depends on the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) type (SceneView or MapView), and the [geometry type](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type) of the graphic.  Each graphic may have its own symbol specified when the parent layer is a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html). For a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) the symbol of each graphic should not be set by the developer since the graphics' rendering properties are determined by the layer's [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.undefined
  /**
    * Indicates the visibility of the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object GraphicProperties {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    geometry: GeometryProperties = null,
    layer: LayerProperties = null,
    popupTemplate: PopupTemplateProperties = null,
    symbol: SymbolProperties = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphicProperties = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GraphicProperties]
  }
}

