package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializationError
  extends StObject
     with Error {
  
  /**
    * The raw response from the server.
    */
  val response: Response
}
object DeserializationError {
  
  inline def apply(message: String, name: String, response: Response): DeserializationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeserializationError] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
