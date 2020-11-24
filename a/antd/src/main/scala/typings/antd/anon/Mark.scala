package typings.antd.anon

import typings.antd.formItemInputMod.FormItemInputMiscProps
import typings.antd.formItemInputMod.FormItemInputProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mark extends js.Object {
  
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
  implicit class MarkOps[Self <: Mark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMark(value: String): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: (FormItemInputProps with FormItemInputMiscProps, ErrorList) => ReactNode): Self = this.set("render", js.Any.fromFunction2(value))
  }
}
