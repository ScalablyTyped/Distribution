package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedScriptURL extends StObject {
  
  var __brand__ : typings.angularCore.angularCoreStrings.TrustedScriptURL
}
object TrustedScriptURL {
  
  inline def apply(): TrustedScriptURL = {
    val __obj = js.Dynamic.literal(__brand__ = "TrustedScriptURL")
    __obj.asInstanceOf[TrustedScriptURL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustedScriptURL] (val x: Self) extends AnyVal {
    
    inline def set__brand__(value: typings.angularCore.angularCoreStrings.TrustedScriptURL): Self = StObject.set(x, "__brand__", value.asInstanceOf[js.Any])
  }
}
