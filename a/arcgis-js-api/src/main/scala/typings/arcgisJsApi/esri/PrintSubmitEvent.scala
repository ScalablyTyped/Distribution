package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintSubmitEvent extends StObject {
  
  var results: PrintSubmitEventResults = js.native
}
object PrintSubmitEvent {
  
  @scala.inline
  def apply(results: PrintSubmitEventResults): PrintSubmitEvent = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSubmitEvent]
  }
  
  @scala.inline
  implicit class PrintSubmitEventMutableBuilder[Self <: PrintSubmitEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: PrintSubmitEventResults): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
