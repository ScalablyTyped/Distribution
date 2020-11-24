package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding extends js.Object {
  
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit = js.native
  
  /**
    * Calls the source method with the specified args object. This method is present in event bindings like trigger/delegate.
    */
  var callSource: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Whether the binding is data-bound.
    */
  var isBound: Boolean = js.native
  
  /**
    * The directionality of the binding.
    */
  var mode: js.UndefOr[bindingMode] = js.native
  
  /**
    * The binding's source.
    */
  var source: Scope = js.native
  
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: js.UndefOr[Expression] = js.native
  
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit = js.native
  
  /**
    * Assigns a value to the source.
    */
  var updateSource: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  /**
    * Assigns a value to the target.
    */
  var updateTarget: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
}
object Binding {
  
  @scala.inline
  def apply(bind: Scope => Unit, isBound: Boolean, source: Scope, unbind: () => Unit): Binding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  implicit class BindingOps[Self <: Binding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBind(value: Scope => Unit): Self = this.set("bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBound(value: Boolean): Self = this.set("isBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Scope): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = this.set("unbind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallSource(value: /* event */ js.Any => _): Self = this.set("callSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallSource: Self = this.set("callSource", js.undefined)
    
    @scala.inline
    def setMode(value: bindingMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSourceExpression(value: Expression): Self = this.set("sourceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceExpression: Self = this.set("sourceExpression", js.undefined)
    
    @scala.inline
    def setUpdateSource(value: /* value */ js.Any => Unit): Self = this.set("updateSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateSource: Self = this.set("updateSource", js.undefined)
    
    @scala.inline
    def setUpdateTarget(value: /* value */ js.Any => Unit): Self = this.set("updateTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateTarget: Self = this.set("updateTarget", js.undefined)
  }
}
