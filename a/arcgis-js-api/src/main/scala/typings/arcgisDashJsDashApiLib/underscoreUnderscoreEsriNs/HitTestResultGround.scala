package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTestResultGround
  extends stdLib.Object {
  /**
    * The distance from camera position to the ground hit. The distance will be `0` if the ground was not hit at all. In global scenes the distance will be in meters while in local scenes the distance will be in the unit of the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var distance: scala.Double
  /**
    * The point at which the ground was hit while performing the hitTest. This may be `null` when the ground was not hit at all (for example by clicking on the sky).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var mapPoint: Point
}

object HitTestResultGround {
  @scala.inline
  def apply(
    constructor: js.Function,
    distance: scala.Double,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    mapPoint: Point,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): HitTestResultGround = {
    val __obj = js.Dynamic.literal(constructor = constructor, distance = distance, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapPoint = mapPoint, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[HitTestResultGround]
  }
}

