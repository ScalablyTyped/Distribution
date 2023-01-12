package typings.antDesignProUtils.anon

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnVisibleChange extends StObject {
  
  var onOpenChange: Unit
  
  var onVisibleChange: Any
  
  var open: Unit
  
  var visible: NonNullable[js.UndefOr[Boolean]]
}
object OnVisibleChange {
  
  inline def apply(onOpenChange: Unit, onVisibleChange: Any, open: Unit): OnVisibleChange = {
    val __obj = js.Dynamic.literal(onOpenChange = onOpenChange.asInstanceOf[js.Any], onVisibleChange = onVisibleChange.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVisibleChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnVisibleChange] (val x: Self) extends AnyVal {
    
    inline def setOnOpenChange(value: Unit): Self = StObject.set(x, "onOpenChange", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChange(value: Any): Self = StObject.set(x, "onVisibleChange", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
