package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationFailure extends StObject {
  
  /**
    * The error code of the failure.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * A message corresponding to the failure.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ValidationFailure {
  
  inline def apply(): ValidationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationFailure] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
