package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneError extends StObject {
  
  /**
    * The SceneError code.
    */
  var code: js.UndefOr[SceneErrorCode] = js.undefined
  
  /**
    * The SceneError message.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
}
object SceneError {
  
  inline def apply(): SceneError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: SceneErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
