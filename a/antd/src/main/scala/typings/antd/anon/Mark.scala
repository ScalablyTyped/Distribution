package typings.antd.anon

import typings.antd.formItemInputMod.FormItemInputMiscProps
import typings.antd.formItemInputMod.FormItemInputProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mark extends StObject {
  
  var mark: String = js.native
  
  def render(props: FormItemInputProps with FormItemInputMiscProps, domList: ErrorList): ReactNode = js.native
}
object Mark {
  
  @scala.inline
  def apply(mark: String, render: (FormItemInputProps with FormItemInputMiscProps, ErrorList) => ReactNode): Mark = {
    val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[Mark]
  }
  
  @scala.inline
  implicit class MarkMutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: (FormItemInputProps with FormItemInputMiscProps, ErrorList) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
