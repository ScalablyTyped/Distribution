package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshapeEventInfo
  extends StObject
     with UpdateToolEventInfo {
  
  /**
    * Returns information indicating the stage of the reshape operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ReshapeEventInfo)
    */
  var `type`: `reshape-start` | reshape | `reshape-stop`
}
object ReshapeEventInfo {
  
  inline def apply(`type`: `reshape-start` | reshape | `reshape-stop`): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReshapeEventInfo] (val x: Self) extends AnyVal {
    
    inline def setType(value: `reshape-start` | reshape | `reshape-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
