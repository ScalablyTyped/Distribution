package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHitTestResult
  extends stdLib.Object {
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest). Results are returned when the location of the input screen coordinates intersect a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the view. See the table below for the specification of each object in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var results: js.Array[SceneViewHitTestResultResults]
}

object SceneViewHitTestResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    results: js.Array[SceneViewHitTestResultResults]
  ): SceneViewHitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, results = results)
  
    __obj.asInstanceOf[SceneViewHitTestResult]
  }
}

