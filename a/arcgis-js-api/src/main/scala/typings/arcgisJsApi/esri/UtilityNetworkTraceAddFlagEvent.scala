package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`starting-point`
import typings.arcgisJsApi.arcgisJsApiStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkTraceAddFlagEvent extends StObject {
  
  var `type`: `starting-point` | barrier
}
object UtilityNetworkTraceAddFlagEvent {
  
  inline def apply(`type`: `starting-point` | barrier): UtilityNetworkTraceAddFlagEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilityNetworkTraceAddFlagEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkTraceAddFlagEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: `starting-point` | barrier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
