package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
  /**
    * A list of errors that might have been generated from processes on this flow.
    */
  var Errors: listOfString
}
object Messages {
  
  inline def apply(Errors: listOfString): Messages = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  extension [Self <: Messages](x: Self) {
    
    inline def setErrors(value: listOfString): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: string*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
