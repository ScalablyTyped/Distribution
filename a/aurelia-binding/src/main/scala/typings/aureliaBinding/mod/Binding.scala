package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding extends StObject {
  
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
  implicit class BindingMutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: Scope => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallSource(value: /* event */ js.Any => _): Self = StObject.set(x, "callSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallSourceUndefined: Self = StObject.set(x, "callSource", js.undefined)
    
    @scala.inline
    def setIsBound(value: Boolean): Self = StObject.set(x, "isBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: bindingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSource(value: Scope): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceExpression(value: Expression): Self = StObject.set(x, "sourceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceExpressionUndefined: Self = StObject.set(x, "sourceExpression", js.undefined)
    
    @scala.inline
    def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateSource(value: /* value */ js.Any => Unit): Self = StObject.set(x, "updateSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateSourceUndefined: Self = StObject.set(x, "updateSource", js.undefined)
    
    @scala.inline
    def setUpdateTarget(value: /* value */ js.Any => Unit): Self = StObject.set(x, "updateTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateTargetUndefined: Self = StObject.set(x, "updateTarget", js.undefined)
  }
}
