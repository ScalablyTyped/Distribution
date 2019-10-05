package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graphic
  extends Accessor
     with JSONSupport
     with IntersectItem {
  /**
    * Name-value pairs of fields and field values associated with the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes)
    */
  var attributes: js.Any = js.native
  /**
    * The geometry that defines the graphic's location.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry)
    */
  var geometry: Geometry = js.native
  /**
    * If applicable, references the layer in which the graphic is stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer)
    */
  var layer: Layer = js.native
  /**
    * The template for displaying content in a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when the graphic is selected. The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) may be used to access a graphic's [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes) and display their values in the view's default popup. See the documentation for [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for details on how to display attribute values in the popup.  As of 4.8 to get the actual `popupTemplate` of the graphic, see the [getEffectivePopupTemplate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getEffectivePopupTemplate) method that either returns this value or the `popupTemplate` of the graphic's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the graphic. Choosing a symbol for a graphic depends on the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) type (SceneView or MapView), and the [geometry type](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type) of the graphic.  Each graphic may have its own symbol specified when the parent layer is a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html). For a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) the symbol of each graphic should not be set by the developer since the graphics' rendering properties are determined by the layer's [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol)
    */
  var symbol: Symbol = js.native
  /**
    * Indicates the visibility of the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
  /**
    * Returns the value of the specified attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getAttribute)
    *
    * @param name The name of the attribute.
    *
    */
  def getAttribute(name: String): js.Any = js.native
  /**
    * Returns the popup template applicable for the graphic. It's either the value of [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#popupTemplate) or the `popupTemplate` from the graphic's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getEffectivePopupTemplate)
    *
    * @param defaultPopupTemplateEnabled Whether support for default popup templates is enabled. When true, a default popup template may be created automatically if neither the graphic nor its layer have a popup template defined.
    *
    */
  def getEffectivePopupTemplate(): PopupTemplate = js.native
  def getEffectivePopupTemplate(defaultPopupTemplateEnabled: Boolean): PopupTemplate = js.native
  /**
    * Sets a new value to the specified attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#setAttribute)
    *
    * @param name The name of the attribute to set.
    * @param newValue The new value to set on the named attribute.
    *
    */
  def setAttribute(name: String, newValue: js.Any): Unit = js.native
}

@JSGlobal("__esri.Graphic")
@js.native
object Graphic extends TopLevel[GraphicConstructor]

