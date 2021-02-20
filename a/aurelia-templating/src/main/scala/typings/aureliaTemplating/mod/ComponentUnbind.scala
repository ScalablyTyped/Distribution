package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentUnbind extends StObject {
  
  /**
    * Implement this hook if you want to perform custom logic after the component is detached and unbound.
    */
  def unbind(): Unit = js.native
}
object ComponentUnbind {
  
  @scala.inline
  def apply(unbind: () => Unit): ComponentUnbind = {
    val __obj = js.Dynamic.literal(unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[ComponentUnbind]
  }
  
  @scala.inline
  implicit class ComponentUnbindMutableBuilder[Self <: ComponentUnbind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
  }
}
