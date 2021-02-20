package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSider extends StObject {
  
  def addSider(id: String): Unit = js.native
  
  def removeSider(id: String): Unit = js.native
}
object AddSider {
  
  @scala.inline
  def apply(addSider: String => Unit, removeSider: String => Unit): AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AddSider]
  }
  
  @scala.inline
  implicit class AddSiderMutableBuilder[Self <: AddSider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSider(value: String => Unit): Self = StObject.set(x, "addSider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSider(value: String => Unit): Self = StObject.set(x, "removeSider", js.Any.fromFunction1(value))
  }
}
