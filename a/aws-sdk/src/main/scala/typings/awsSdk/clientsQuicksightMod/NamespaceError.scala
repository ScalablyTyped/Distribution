package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceError extends StObject {
  
  /**
    * The message for the error.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The error type.
    */
  var Type: js.UndefOr[NamespaceErrorType] = js.undefined
}
object NamespaceError {
  
  inline def apply(): NamespaceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceError]
  }
  
  extension [Self <: NamespaceError](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: NamespaceErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
