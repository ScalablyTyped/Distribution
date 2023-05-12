package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSetBatchError extends StObject {
  
  /**
    * The error's code.
    */
  var code: String
  
  /**
    * The error's ID.
    */
  var id: ReadSetId
  
  /**
    * The error's message.
    */
  var message: String
}
object ReadSetBatchError {
  
  inline def apply(code: String, id: ReadSetId, message: String): ReadSetBatchError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSetBatchError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSetBatchError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setId(value: ReadSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
