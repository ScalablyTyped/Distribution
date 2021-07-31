package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var Cancel: Boolean
  
  val Response: js.Any
}
object Response {
  
  @scala.inline
  def apply(Cancel: Boolean, Response: js.Any): Response = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
