package typings.antd.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorList extends StObject {
  
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
  implicit class ErrorListMutableBuilder[Self <: ErrorList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorList(value: Element): Self = StObject.set(x, "errorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: Element): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraNull: Self = StObject.set(x, "extra", null)
    
    @scala.inline
    def setInput(value: Element): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
