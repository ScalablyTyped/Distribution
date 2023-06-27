package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewScreenPoint extends StObject {
  
  /**
  		 * The x coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ScreenPoint)
  		 */
  var x: Double
  
  /**
  		 * The y coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ScreenPoint)
  		 */
  var y: Double
}
object SceneViewScreenPoint {
  
  inline def apply(x: Double, y: Double): SceneViewScreenPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewScreenPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewScreenPoint] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
