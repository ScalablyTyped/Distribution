package typings.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTab extends StObject {
  
  def addTab(id: Any): Unit
  
  def removeTab(id: Any): Unit
}
object AddTab {
  
  inline def apply(addTab: Any => Unit, removeTab: Any => Unit): AddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
    __obj.asInstanceOf[AddTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTab] (val x: Self) extends AnyVal {
    
    inline def setAddTab(value: Any => Unit): Self = StObject.set(x, "addTab", js.Any.fromFunction1(value))
    
    inline def setRemoveTab(value: Any => Unit): Self = StObject.set(x, "removeTab", js.Any.fromFunction1(value))
  }
}
