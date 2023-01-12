package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateVariableError extends StObject {
  
  /**
    * The error code. 
    */
  var code: js.UndefOr[integer] = js.undefined
  
  /**
    * The error message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object BatchCreateVariableError {
  
  inline def apply(): BatchCreateVariableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateVariableError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateVariableError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
