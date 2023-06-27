package typings.arcgisJsApi.esri

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewHitTestResult extends StObject {
  
  /**
  		 * Ground intersection result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
  		 */
  var ground: HitTestResultGround
  
  /**
  		 * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest) when the location of the input screen coordinates intersect features in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
  		 */
  var results: js.Array[SceneViewViewHit]
  
  /**
  		 * The screen coordinates (or native mouse event) of the click on the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
  		 */
  var screenPoint: SceneViewScreenPoint | MouseEvent
}
object SceneViewHitTestResult {
  
  inline def apply(
    ground: HitTestResultGround,
    results: js.Array[SceneViewViewHit],
    screenPoint: SceneViewScreenPoint | MouseEvent
  ): SceneViewHitTestResult = {
    val __obj = js.Dynamic.literal(ground = ground.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewHitTestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewHitTestResult] (val x: Self) extends AnyVal {
    
    inline def setGround(value: HitTestResultGround): Self = StObject.set(x, "ground", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[SceneViewViewHit]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SceneViewViewHit*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setScreenPoint(value: SceneViewScreenPoint | MouseEvent): Self = StObject.set(x, "screenPoint", value.asInstanceOf[js.Any])
  }
}
