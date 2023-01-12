package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedScript extends StObject {
  
  var __brand__ : typings.angularCore.angularCoreStrings.TrustedScript
}
object TrustedScript {
  
  inline def apply(): TrustedScript = {
    val __obj = js.Dynamic.literal(__brand__ = "TrustedScript")
    __obj.asInstanceOf[TrustedScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustedScript] (val x: Self) extends AnyVal {
    
    inline def set__brand__(value: typings.angularCore.angularCoreStrings.TrustedScript): Self = StObject.set(x, "__brand__", value.asInstanceOf[js.Any])
  }
}
