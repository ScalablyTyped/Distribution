package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`rotate-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`rotate-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateEventInfo
  extends StObject
     with UpdateToolEventInfo {
  
  /**
    * Angle of rotation in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var angle: Double
  
  /**
    * Returns information indicating the stage of the rotate operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var `type`: `rotate-start` | rotate | `rotate-stop`
}
object RotateEventInfo {
  
  inline def apply(angle: Double, `type`: `rotate-start` | rotate | `rotate-stop`): RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateEventInfo]
  }
  
  extension [Self <: RotateEventInfo](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setType(value: `rotate-start` | rotate | `rotate-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
