package typings
package aureliaDashBindingLib.aureliaDashBindingMod

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
  var isBound: scala.Boolean
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
  var updateSource: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  /**
    * Assigns a value to the target.
    */
  var updateTarget: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): scala.Unit
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): scala.Unit
}

