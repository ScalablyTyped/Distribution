package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHitTestResultResults extends Object {
  /**
    * The distance from the camera position to the point geometry hit on this graphic. In global scenes the distance will be in meters while in local scenes the distance will be in the unit of the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var distance: Double
  /**
    * A graphic present in the view that intersects the input screen coordinates. Starting with version 4.11, if a label intersects the input screen coordinates the corresponding graphic is returned. If the graphic comes from a layer with an applied [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html), then the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol) property will be empty. Other properties will be empty based on the context in which the graphic is fetched. Some layers do not have a [graphic.geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry) (for example: [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) and [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) `PointCloudLayer`) The [graphic.attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes) only includes attributes which are loaded by the client, for this reason it can be a subset of all attributes. [FeatureLayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields) with `["*"]` can be used to force all attributes to be present. The [graphic.symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol) exists only for graphics coming from [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) or [view.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics) but it is possible to compute the displayed symbology with [getDisplayedSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var graphic: Graphic
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var mapPoint: Point
}

object SceneViewHitTestResultResults {
  @scala.inline
  def apply(
    constructor: js.Function,
    distance: Double,
    graphic: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewHitTestResultResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SceneViewHitTestResultResults]
  }
}

