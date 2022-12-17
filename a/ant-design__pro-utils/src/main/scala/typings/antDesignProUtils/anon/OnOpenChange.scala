package typings.antDesignProUtils.anon

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnOpenChange extends StObject {
  
  var onOpenChange: Any
  
  var onVisibleChange: Unit
  
  var open: NonNullable[js.UndefOr[Boolean]]
  
  var visible: Unit
}
object OnOpenChange {
  
  inline def apply(onOpenChange: Any, onVisibleChange: Unit, visible: Unit): OnOpenChange = {
    val __obj = js.Dynamic.literal(onOpenChange = onOpenChange.asInstanceOf[js.Any], onVisibleChange = onVisibleChange.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenChange]
  }
  
  extension [Self <: OnOpenChange](x: Self) {
    
    inline def setOnOpenChange(value: Any): Self = StObject.set(x, "onOpenChange", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChange(value: Unit): Self = StObject.set(x, "onVisibleChange", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setVisible(value: Unit): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
