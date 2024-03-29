package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvidedIn extends StObject {
  
  var providedIn: Type[Any] | root | platform | any | Null
}
object ProvidedIn {
  
  inline def apply(): ProvidedIn = {
    val __obj = js.Dynamic.literal(providedIn = null)
    __obj.asInstanceOf[ProvidedIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvidedIn] (val x: Self) extends AnyVal {
    
    inline def setProvidedIn(value: Type[Any] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
  }
}
