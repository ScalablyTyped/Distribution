package typings.antd.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorList extends js.Object {
  
  var errorList: Element = js.native
  
  var extra: Element | Null = js.native
  
  var input: Element = js.native
}
object ErrorList {
  
  @scala.inline
  def apply(errorList: Element, input: Element): ErrorList = {
    val __obj = js.Dynamic.literal(errorList = errorList.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorList]
  }
  
  @scala.inline
  implicit class ErrorListOps[Self <: ErrorList] (val x: Self) extends AnyVal {
    
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
    def setErrorList(value: Element): Self = this.set("errorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: Element): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: Element): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraNull: Self = this.set("extra", null)
  }
}
