package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateViewModelLocateErrorEvent extends StObject {
  
  var error: Error
}
object LocateViewModelLocateErrorEvent {
  
  @scala.inline
  def apply(error: Error): LocateViewModelLocateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateViewModelLocateErrorEvent]
  }
  
  @scala.inline
  implicit class LocateViewModelLocateErrorEventMutableBuilder[Self <: LocateViewModelLocateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
