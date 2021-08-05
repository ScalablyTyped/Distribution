package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToFirstRowOnChange extends StObject {
  
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined
}
object ScrollToFirstRowOnChange {
  
  inline def apply(): ScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToFirstRowOnChange]
  }
  
  extension [Self <: ScrollToFirstRowOnChange](x: Self) {
    
    inline def setScrollToFirstRowOnChange(value: Boolean): Self = StObject.set(x, "scrollToFirstRowOnChange", value.asInstanceOf[js.Any])
    
    inline def setScrollToFirstRowOnChangeUndefined: Self = StObject.set(x, "scrollToFirstRowOnChange", js.undefined)
  }
}
