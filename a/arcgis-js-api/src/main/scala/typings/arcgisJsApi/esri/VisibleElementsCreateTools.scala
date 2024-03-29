package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsCreateTools extends StObject {
  
  /**
  		 * Indicates whether to display the circle sketch tool.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
  		 */
  var circle: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the point sketch tool.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
  		 */
  var point: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the polygon sketch tool.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
  		 */
  var polygon: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the polyline sketch tool.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
  		 */
  var polyline: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the rectangle sketch tool.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
  		 */
  var rectangle: js.UndefOr[Boolean] = js.undefined
}
object VisibleElementsCreateTools {
  
  inline def apply(): VisibleElementsCreateTools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElementsCreateTools]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElementsCreateTools] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPolygon(value: Boolean): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    inline def setPolyline(value: Boolean): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setRectangle(value: Boolean): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
