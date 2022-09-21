package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the error.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait SKError extends StObject {
  
  /**
    * A unique error code.
    */
  var code: String
  
  /**
    * A description about the actual error.
    */
  var error: String
  
  /**
    * The error message.
    */
  var message: String
  
  /**
    * An association transaction (if applicable).
    */
  var transaction: js.UndefOr[SKPaymentTransaction] = js.undefined
}
object SKError {
  
  inline def apply(code: String, error: String, message: String): SKError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SKError]
  }
  
  extension [Self <: SKError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: SKPaymentTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
