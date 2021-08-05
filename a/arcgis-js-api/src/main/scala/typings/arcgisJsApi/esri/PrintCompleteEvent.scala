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
  
  extension [Self <: PrintCompleteEvent](x: Self) {
    
    inline def setResults(value: PrintCompleteEventResults): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
