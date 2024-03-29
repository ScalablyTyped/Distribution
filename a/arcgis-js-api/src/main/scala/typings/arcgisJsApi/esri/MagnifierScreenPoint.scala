package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MagnifierScreenPoint extends StObject {
  
  /**
  		 * The x coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#ScreenPoint)
  		 */
  var x: Double
  
  /**
  		 * The y coordinate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#ScreenPoint)
  		 */
  var y: Double
}
object MagnifierScreenPoint {
  
  inline def apply(x: Double, y: Double): MagnifierScreenPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierScreenPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MagnifierScreenPoint] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
