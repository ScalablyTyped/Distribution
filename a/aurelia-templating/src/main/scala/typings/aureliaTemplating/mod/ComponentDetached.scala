package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDetached extends StObject {
  
  /**
    * Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
    */
  def detached(): Unit = js.native
}
object ComponentDetached {
  
  @scala.inline
  def apply(detached: () => Unit): ComponentDetached = {
    val __obj = js.Dynamic.literal(detached = js.Any.fromFunction0(detached))
    __obj.asInstanceOf[ComponentDetached]
  }
  
  @scala.inline
  implicit class ComponentDetachedMutableBuilder[Self <: ComponentDetached] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
  }
}
