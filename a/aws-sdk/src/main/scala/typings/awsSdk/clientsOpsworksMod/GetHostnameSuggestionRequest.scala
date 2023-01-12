package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostnameSuggestionRequest extends StObject {
  
  /**
    * The layer ID.
    */
  var LayerId: String
}
object GetHostnameSuggestionRequest {
  
  inline def apply(LayerId: String): GetHostnameSuggestionRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostnameSuggestionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHostnameSuggestionRequest] (val x: Self) extends AnyVal {
    
    inline def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
  }
}
