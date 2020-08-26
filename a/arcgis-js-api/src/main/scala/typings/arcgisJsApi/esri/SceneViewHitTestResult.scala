package typings.arcgisJsApi.esri

import typings.std.MouseEvent
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewHitTestResult extends Object {
  /**
    * Ground intersection result. The ground hit result will always be returned, even if the ground was excluded from the [hitTest](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var ground: HitTestResultGround = js.native
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest). Results are returned when the location of the input screen coordinates intersect a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the view. See the table below for the specification of each object in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var results: js.Array[SceneViewHitTestResultResults] = js.native
  /**
    * The screen coordinates (or native mouse event) of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var screenPoint: SceneViewScreenPoint | MouseEvent = js.native
}

object SceneViewHitTestResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    ground: HitTestResultGround,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SceneViewHitTestResultResults],
    screenPoint: SceneViewScreenPoint | MouseEvent
  ): SceneViewHitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], ground = ground.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewHitTestResult]
  }
  @scala.inline
  implicit class SceneViewHitTestResultOps[Self <: SceneViewHitTestResult] (val x: Self) extends AnyVal {
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
    def setGround(value: HitTestResultGround): Self = this.set("ground", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: SceneViewHitTestResultResults*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SceneViewHitTestResultResults]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenPoint(value: SceneViewScreenPoint | MouseEvent): Self = this.set("screenPoint", value.asInstanceOf[js.Any])
  }
  
}

