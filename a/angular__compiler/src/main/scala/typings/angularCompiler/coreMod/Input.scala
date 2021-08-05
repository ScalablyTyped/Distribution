package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setBindingPropertyName(value: String): Self = StObject.set(x, "bindingPropertyName", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertyNameUndefined: Self = StObject.set(x, "bindingPropertyName", js.undefined)
  }
}
