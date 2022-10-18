package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationError extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[Code] = js.undefined
  
  /**
    * The ID of the error.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The message, or reason, for the error.
    */
  var message: js.UndefOr[Message] = js.undefined
}
object GetRecommendationError {
  
  inline def apply(): GetRecommendationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationError]
  }
  
  extension [Self <: GetRecommendationError](x: Self) {
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
