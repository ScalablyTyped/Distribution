package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveEventInfo
  extends StObject
     with UpdateToolEventInfo {
  
  /**
  		 * Number of pixels moved on the x-axis from the last known position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
  		 */
  var dx: Double
  
  /**
  		 * Number of pixels moved on the y-axis from the last known position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
  		 */
  var dy: Double
  
  /**
  		 * The instance of the graphic that is being moved.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
  		 */
  var mover: Graphic
  
  /**
  		 * Returns information indicating the stage of the move operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
  		 */
  var `type`: `move-start` | move | `move-stop`
}
object MoveEventInfo {
  
  inline def apply(dx: Double, dy: Double, mover: Graphic, `type`: `move-start` | move | `move-stop`): MoveEventInfo = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], mover = mover.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveEventInfo] (val x: Self) extends AnyVal {
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setMover(value: Graphic): Self = StObject.set(x, "mover", value.asInstanceOf[js.Any])
    
    inline def setType(value: `move-start` | move | `move-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
