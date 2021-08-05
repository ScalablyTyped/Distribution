package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateLocateErrorEvent extends StObject {
  
  var error: Error
}
object LocateLocateErrorEvent {
  
  inline def apply(error: Error): LocateLocateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateLocateErrorEvent]
  }
  
  extension [Self <: LocateLocateErrorEvent](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
