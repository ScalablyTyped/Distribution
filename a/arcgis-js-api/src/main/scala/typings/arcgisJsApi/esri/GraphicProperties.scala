package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicProperties extends js.Object {
  /**
    * Name-value pairs of fields and field values associated with the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes)
    */
  var attributes: js.UndefOr[js.Any] = js.native
  /**
    * The geometry that defines the graphic's location.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  /**
    * If applicable, references the layer in which the graphic is stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  /**
    * The template for displaying content in a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when the graphic is selected. The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) may be used to access a graphic's [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes) and display their values in the view's default popup. See the documentation for [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for details on how to display attribute values in the popup.  As of 4.8 to get the actual `popupTemplate` of the graphic, see the [getEffectivePopupTemplate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getEffectivePopupTemplate) method that either returns this value or the `popupTemplate` of the graphic's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * The [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the graphic. Choosing a symbol for a graphic depends on the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) type (SceneView or MapView), and the [geometry type](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type) of the graphic.  Each graphic may have its own symbol specified when the parent layer is a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html). For a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) the symbol of each graphic should not be set by the developer since the graphics' rendering properties are determined by the layer's [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.native
  /**
    * Indicates the visibility of the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object GraphicProperties {
  @scala.inline
  def apply(): GraphicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicProperties]
  }
  @scala.inline
  implicit class GraphicPropertiesOps[Self <: GraphicProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setGeometry(value: GeometryProperties): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setLayer(value: LayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setSymbol(value: SymbolProperties): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

