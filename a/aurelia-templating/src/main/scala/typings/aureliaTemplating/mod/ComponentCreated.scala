package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentCreated extends StObject {
  
  /**
    * Implement this hook if you want to perform custom logic after the constructor has been called.
    * At this point in time, the view has also been created and both the view-model and the view
    * are connected to their controller. The hook will recieve the instance of the "owningView".
    * This is the view that the component is declared inside of. If the component itself has a view,
    * this will be passed second.
    */
  def created(owningView: View_, myView: View_): Unit = js.native
}
object ComponentCreated {
  
  @scala.inline
  def apply(created: (View_, View_) => Unit): ComponentCreated = {
    val __obj = js.Dynamic.literal(created = js.Any.fromFunction2(created))
    __obj.asInstanceOf[ComponentCreated]
  }
  
  @scala.inline
  implicit class ComponentCreatedMutableBuilder[Self <: ComponentCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: (View_, View_) => Unit): Self = StObject.set(x, "created", js.Any.fromFunction2(value))
  }
}
