package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  /**
    * Calls the source method with the specified args object. This method is present in event bindings like trigger/delegate.
    */
  var callSource: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Whether the binding is data-bound.
    */
  var isBound: Boolean
  /**
    * The directionality of the binding.
    */
  var mode: js.UndefOr[bindingMode] = js.undefined
  /**
    * The binding's source.
    */
  var source: Scope
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: js.UndefOr[Expression] = js.undefined
  /**
    * Assigns a value to the source.
    */
  var updateSource: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Assigns a value to the target.
    */
  var updateTarget: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit
}

object Binding {
  @scala.inline
  def apply(
    bind: Scope => Unit,
    isBound: Boolean,
    source: Scope,
    unbind: () => Unit,
    callSource: /* event */ js.Any => _ = null,
    mode: bindingMode = null,
    sourceExpression: Expression = null,
    updateSource: /* value */ js.Any => Unit = null,
    updateTarget: /* value */ js.Any => Unit = null
  ): Binding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
    if (callSource != null) __obj.updateDynamic("callSource")(js.Any.fromFunction1(callSource))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (sourceExpression != null) __obj.updateDynamic("sourceExpression")(sourceExpression.asInstanceOf[js.Any])
    if (updateSource != null) __obj.updateDynamic("updateSource")(js.Any.fromFunction1(updateSource))
    if (updateTarget != null) __obj.updateDynamic("updateTarget")(js.Any.fromFunction1(updateTarget))
    __obj.asInstanceOf[Binding]
  }
}

