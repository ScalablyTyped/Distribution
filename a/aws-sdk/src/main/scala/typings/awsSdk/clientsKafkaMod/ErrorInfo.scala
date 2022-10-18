package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  /**
    * 
    A number describing the error programmatically.
    
    */
  var ErrorCode: js.UndefOr[string] = js.undefined
  
  /**
    * 
    An optional field to provide more details about the error.
    
    */
  var ErrorString: js.UndefOr[string] = js.undefined
}
object ErrorInfo {
  
  inline def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setErrorCode(value: string): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorString(value: string): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    inline def setErrorStringUndefined: Self = StObject.set(x, "ErrorString", js.undefined)
  }
}
