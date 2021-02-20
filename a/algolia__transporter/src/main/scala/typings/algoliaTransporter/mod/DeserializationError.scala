package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & { readonly response :@algolia/requester-common.@algolia/requester-common.Response} */
@js.native
trait DeserializationError extends StObject {
  
  var message: String = js.native
  
  var name: String = js.native
  
  /**
    * The raw response from the server.
    */
  val response: Response = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object DeserializationError {
  
  @scala.inline
  def apply(message: String, name: String, response: Response): DeserializationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializationError]
  }
  
  @scala.inline
  implicit class DeserializationErrorMutableBuilder[Self <: DeserializationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
