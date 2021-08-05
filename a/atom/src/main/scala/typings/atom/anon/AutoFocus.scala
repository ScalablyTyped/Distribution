package typings.atom.anon

import typings.atom.mod.FocusableHTMLElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFocus[T] extends StObject {
  
  var autoFocus: js.UndefOr[Boolean | FocusableHTMLElement] = js.undefined
  
  var item: T
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AutoFocus {
  
  inline def apply[T](item: T): AutoFocus[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus[T]]
  }
  
  extension [Self <: AutoFocus[?], T](x: Self & AutoFocus[T]) {
    
    inline def setAutoFocus(value: Boolean | FocusableHTMLElement): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusFunction0(value: () => HTMLElement): Self = StObject.set(x, "autoFocus", js.Any.fromFunction0(value))
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
