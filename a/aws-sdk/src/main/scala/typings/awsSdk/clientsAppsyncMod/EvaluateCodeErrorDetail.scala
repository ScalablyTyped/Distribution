package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateCodeErrorDetail extends StObject {
  
  /**
    * Contains the list of CodeError objects.
    */
  var codeErrors: js.UndefOr[CodeErrors] = js.undefined
  
  /**
    * The error payload.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
}
object EvaluateCodeErrorDetail {
  
  inline def apply(): EvaluateCodeErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluateCodeErrorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateCodeErrorDetail] (val x: Self) extends AnyVal {
    
    inline def setCodeErrors(value: CodeErrors): Self = StObject.set(x, "codeErrors", value.asInstanceOf[js.Any])
    
    inline def setCodeErrorsUndefined: Self = StObject.set(x, "codeErrors", js.undefined)
    
    inline def setCodeErrorsVarargs(value: CodeError*): Self = StObject.set(x, "codeErrors", js.Array(value*))
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
