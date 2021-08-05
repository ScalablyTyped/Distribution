package typings.arcgisJsApi.esri

import typings.std.MouseEvent
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewHitTestResult
  extends StObject
     with Object {
  
  /**
    * Ground intersection result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var ground: HitTestResultGround
  
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var results: js.Array[SceneViewHitTestResultResults]
  
  /**
    * The screen coordinates (or native mouse event) of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var screenPoint: SceneViewScreenPoint | MouseEvent
}
object SceneViewHitTestResult {
  
  inline def apply(
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
  
  extension [Self <: SceneViewHitTestResult](x: Self) {
    
    inline def setGround(value: HitTestResultGround): Self = StObject.set(x, "ground", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[SceneViewHitTestResultResults]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SceneViewHitTestResultResults*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    inline def setScreenPoint(value: SceneViewScreenPoint | MouseEvent): Self = StObject.set(x, "screenPoint", value.asInstanceOf[js.Any])
  }
}
