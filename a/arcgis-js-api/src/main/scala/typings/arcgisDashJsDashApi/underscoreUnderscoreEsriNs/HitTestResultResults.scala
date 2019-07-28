package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTestResultResults extends Object {
  /**
    * A graphic representing a feature in the view that intersects the input screen coordinates. If the graphic comes from a layer with an applied [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html), then the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol) property will be empty. Other properties may be empty based on the context in which the graphic is fetched.  If the result comes from a [VectorTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html) then a static graphic is returned with two `attributes`: `layerId` and `layerName`. These correspond to the name and id of the style-layer in the [vector tile style](https://developers.arcgis.com/rest/services-reference/vector-tile-style.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var graphic: Graphic
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var mapPoint: Point
}

object HitTestResultResults {
  @scala.inline
  def apply(
    constructor: js.Function,
    graphic: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HitTestResultResults = {
    val __obj = js.Dynamic.literal(constructor = constructor, graphic = graphic, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapPoint = mapPoint, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[HitTestResultResults]
  }
}

