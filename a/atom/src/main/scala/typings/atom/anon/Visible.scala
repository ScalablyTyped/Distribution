package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible[T] extends StObject {
  
  var item: T
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Visible {
  
  inline def apply[T](item: T): Visible[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible[T]]
  }
  
  extension [Self <: Visible[?], T](x: Self & Visible[T]) {
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
