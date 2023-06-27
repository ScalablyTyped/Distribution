package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewTakeScreenshotOptionsArea extends StObject {
  
  /**
  		 * The height of the area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
  		 */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The x coordinate of the area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
  		 */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The y coordinate of the area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
  		 */
  var y: js.UndefOr[Double] = js.undefined
}
object SceneViewTakeScreenshotOptionsArea {
  
  inline def apply(): SceneViewTakeScreenshotOptionsArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewTakeScreenshotOptionsArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewTakeScreenshotOptionsArea] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
