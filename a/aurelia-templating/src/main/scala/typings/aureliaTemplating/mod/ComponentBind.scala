package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBind extends StObject {
  
  /**
  	* Implement this hook if you want to perform custom logic when databinding is activated on the view and view-model.
  	* The "binding context" to which the component is being bound will be passed first.
  	* An "override context" will be passed second. The override context contains information used to traverse
  	* the parent hierarchy and can also be used to add any contextual properties that the component wants to add.
  	*/
  def bind(bindingContext: Any, overrideContext: Any): Unit
}
object ComponentBind {
  
  inline def apply(bind: (Any, Any) => Unit): ComponentBind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
    __obj.asInstanceOf[ComponentBind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentBind] (val x: Self) extends AnyVal {
    
    inline def setBind(value: (Any, Any) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
  }
}
