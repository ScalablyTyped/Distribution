package typings.antdMobile.anon

import typings.rcFieldForm.esInterfaceMod.FormInstance
import typings.rcFieldForm.esInterfaceMod.NamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: FormInstance[Any]
  
  var namePath: NamePath
  
  def onChange(): Unit
}
object Form {
  
  inline def apply(form: FormInstance[Any], namePath: NamePath, onChange: () => Unit): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], namePath = namePath.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange))
    __obj.asInstanceOf[Form]
  }
  
  extension [Self <: Form](x: Self) {
    
    inline def setForm(value: FormInstance[Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setNamePath(value: NamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
    
    inline def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value*))
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
  }
}
