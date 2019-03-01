package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHitTestResultResults
  extends stdLib.Object {
  /**
    * A graphic present in the view that intersects the input screen coordinates. If the graphic comes from a layer with an applied [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html), then the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol) property will be empty. Other properties will be empty based on the context in which the graphic is fetched.
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
    graphic: Graphic,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    mapPoint: Point,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): SceneViewHitTestResultResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("graphic")(graphic)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("mapPoint")(mapPoint)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[SceneViewHitTestResultResults]
  }
}

