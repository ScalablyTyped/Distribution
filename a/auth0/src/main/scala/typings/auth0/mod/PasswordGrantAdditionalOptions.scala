package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordGrantAdditionalOptions extends StObject {
  
  var forwardedFor: js.UndefOr[String] = js.undefined
}
object PasswordGrantAdditionalOptions {
  
  inline def apply(): PasswordGrantAdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordGrantAdditionalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordGrantAdditionalOptions] (val x: Self) extends AnyVal {
    
    inline def setForwardedFor(value: String): Self = StObject.set(x, "forwardedFor", value.asInstanceOf[js.Any])
    
    inline def setForwardedForUndefined: Self = StObject.set(x, "forwardedFor", js.undefined)
  }
}
