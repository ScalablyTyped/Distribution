package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidedIn extends StObject {
  
  var providedIn: Type[_] | root | platform | any | Null = js.native
}
object ProvidedIn {
  
  @scala.inline
  def apply(): ProvidedIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvidedIn]
  }
  
  @scala.inline
  implicit class ProvidedInMutableBuilder[Self <: ProvidedIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvidedIn(value: Type[_] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
  }
}
