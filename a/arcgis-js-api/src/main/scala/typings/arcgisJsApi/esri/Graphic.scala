package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graphic
  extends StObject
     with Accessor
     with JSONSupport
     with IntersectItem
     with _GoToTarget2D
     with _GoToTarget3D
     with _HitTestItem
     with _ProfileVariableInstanceType
     with _ResultType {
  
  /**
    * The aggregateGeometries contains spatial aggregation geometries when [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticType) query is executed with `envelope-aggregate`, `centroid-aggregate` and/or `convex-hull-aggregate` statistics type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#aggregateGeometries)
    */
  var aggregateGeometries: Any = js.native
  
  /**
    * Name-value pairs of fields and field values associated with the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes)
    */
  var attributes: Any = js.native
  
  /**
    * The geometry that defines the graphic's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry)
    */
  var geometry: Geometry_ = js.native
  
  /**
    * Returns the value of the specified attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getAttribute)
    */
  def getAttribute(name: String): Any = js.native
  
  /**
    * Returns the popup template applicable for the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getEffectivePopupTemplate)
    */
  def getEffectivePopupTemplate(): PopupTemplate = js.native
  def getEffectivePopupTemplate(defaultPopupTemplateEnabled: Boolean): PopupTemplate = js.native
  
  /**
    * Returns the Object ID of the feature associated with the graphic, if it exists.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#getObjectId)
    */
  def getObjectId(): Double = js.native
  
  /**
    * Indicates whether the graphic refers to an aggregate, or [cluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#isAggregate)
    */
  val isAggregate: Boolean = js.native
  
  /**
    * If applicable, references the layer in which the graphic is stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer)
    */
  var layer: Layer = js.native
  
  /**
    * The template for displaying content in a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when the graphic is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * Sets a new value to the specified attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#setAttribute)
    */
  def setAttribute(name: String, newValue: Any): scala.Unit = js.native
  
  /**
    * The [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol)
    */
  var symbol: Symbol = js.native
  
  /**
    * Indicates the visibility of the graphic.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#visible)
    */
  var visible: Boolean = js.native
}
