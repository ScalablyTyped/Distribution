package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintSubmitEvent extends StObject {
  
  var results: PrintSubmitEventResults
}
object PrintSubmitEvent {
  
  inline def apply(results: PrintSubmitEventResults): PrintSubmitEvent = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSubmitEvent]
  }
  
  extension [Self <: PrintSubmitEvent](x: Self) {
    
    inline def setResults(value: PrintSubmitEventResults): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
