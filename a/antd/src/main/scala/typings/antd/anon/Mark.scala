package typings.antd.anon

import typings.antd.formItemInputMod.FormItemInputMiscProps
import typings.antd.formItemInputMod.FormItemInputProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mark extends StObject {
  
  var mark: String
  
  def render(props: FormItemInputProps & FormItemInputMiscProps, domList: ErrorList): ReactNode
}
object Mark {
  
  inline def apply(mark: String, render: (FormItemInputProps & FormItemInputMiscProps, ErrorList) => ReactNode): Mark = {
    val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[Mark]
  }
  
  extension [Self <: Mark](x: Self) {
    
    inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setRender(value: (FormItemInputProps & FormItemInputMiscProps, ErrorList) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
