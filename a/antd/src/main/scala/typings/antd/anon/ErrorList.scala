package typings.antd.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorList extends StObject {
  
  var errorList: Element | Null
  
  var extra: Element | Null
  
  var input: Element
}
object ErrorList {
  
  inline def apply(input: Element): ErrorList = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], errorList = null, extra = null)
    __obj.asInstanceOf[ErrorList]
  }
  
  extension [Self <: ErrorList](x: Self) {
    
    inline def setErrorList(value: Element): Self = StObject.set(x, "errorList", value.asInstanceOf[js.Any])
    
    inline def setErrorListNull: Self = StObject.set(x, "errorList", null)
    
    inline def setExtra(value: Element): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraNull: Self = StObject.set(x, "extra", null)
    
    inline def setInput(value: Element): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
