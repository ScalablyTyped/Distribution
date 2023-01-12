package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSider extends StObject {
  
  def addSider(id: String): Unit
  
  def removeSider(id: String): Unit
}
object AddSider {
  
  inline def apply(addSider: String => Unit, removeSider: String => Unit): AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AddSider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddSider] (val x: Self) extends AnyVal {
    
    inline def setAddSider(value: String => Unit): Self = StObject.set(x, "addSider", js.Any.fromFunction1(value))
    
    inline def setRemoveSider(value: String => Unit): Self = StObject.set(x, "removeSider", js.Any.fromFunction1(value))
  }
}
