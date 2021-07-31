package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToFirstRowOnChange extends StObject {
  
  var scrollToFirstRowOnChange: js.UndefOr[Boolean] = js.undefined
}
object ScrollToFirstRowOnChange {
  
  @scala.inline
  def apply(): ScrollToFirstRowOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToFirstRowOnChange]
  }
  
  @scala.inline
  implicit class ScrollToFirstRowOnChangeMutableBuilder[Self <: ScrollToFirstRowOnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollToFirstRowOnChange(value: Boolean): Self = StObject.set(x, "scrollToFirstRowOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToFirstRowOnChangeUndefined: Self = StObject.set(x, "scrollToFirstRowOnChange", js.undefined)
  }
}
