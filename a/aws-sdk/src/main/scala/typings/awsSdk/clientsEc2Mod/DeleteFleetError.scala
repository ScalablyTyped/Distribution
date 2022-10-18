package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[DeleteFleetErrorCode] = js.undefined
  
  /**
    * The description for the error code.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object DeleteFleetError {
  
  inline def apply(): DeleteFleetError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetError]
  }
  
  extension [Self <: DeleteFleetError](x: Self) {
    
    inline def setCode(value: DeleteFleetErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
