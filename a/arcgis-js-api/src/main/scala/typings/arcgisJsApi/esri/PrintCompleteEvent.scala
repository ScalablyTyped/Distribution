package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintCompleteEvent extends StObject {
  
  var results: PrintCompleteEventResults
}
object PrintCompleteEvent {
  
  inline def apply(results: PrintCompleteEventResults): PrintCompleteEvent = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCompleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintCompleteEvent] (val x: Self) extends AnyVal {
    
    inline def setResults(value: PrintCompleteEventResults): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
