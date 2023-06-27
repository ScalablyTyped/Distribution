package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleEventInfo
  extends StObject
     with UpdateToolEventInfo {
  
  /**
  		 * Returns information indicating the stage of the scale operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
  		 */
  var `type`: `scale-start` | scale | `scale-stop`
  
  /**
  		 * The x scale factor used to enlarge or shrink the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
  		 */
  var xScale: Double
  
  /**
  		 * The y scale factor used to enlarge or shrink the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
  		 */
  var yScale: Double
}
object ScaleEventInfo {
  
  inline def apply(`type`: `scale-start` | scale | `scale-stop`, xScale: Double, yScale: Double): ScaleEventInfo = {
    val __obj = js.Dynamic.literal(xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleEventInfo] (val x: Self) extends AnyVal {
    
    inline def setType(value: `scale-start` | scale | `scale-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXScale(value: Double): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(value: Double): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
