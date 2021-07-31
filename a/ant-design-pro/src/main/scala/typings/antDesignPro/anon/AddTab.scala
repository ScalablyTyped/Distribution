package typings.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTab extends StObject {
  
  def addTab(id: js.Any): Unit
  
  def removeTab(id: js.Any): Unit
}
object AddTab {
  
  @scala.inline
  def apply(addTab: js.Any => Unit, removeTab: js.Any => Unit): AddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
    __obj.asInstanceOf[AddTab]
  }
  
  @scala.inline
  implicit class AddTabMutableBuilder[Self <: AddTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTab(value: js.Any => Unit): Self = StObject.set(x, "addTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTab(value: js.Any => Unit): Self = StObject.set(x, "removeTab", js.Any.fromFunction1(value))
  }
}
