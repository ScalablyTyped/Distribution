package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "Expression")
@js.native
class Expression () extends js.Object {
  /**
    * Accepts an expression visitor.
    */
  def accept(visitor: ExpressionVisitor): Unit = js.native
  /**
    * Assigns a value to the property represented by the expression.
    */
  def assign(scope: Scope, value: js.Any, lookupFunctions: LookupFunctions): Unit = js.native
  /**
    * Subscribes a binding instance to the property change events along the path of the expression.
    */
  def connect(binding: Binding, scope: Scope): Unit = js.native
  /**
    * Evaluates the expression using the provided scope and lookup functions.
    * @param scope The scope (bindingContext + overrideContext)
    * @param lookupFunctions Required for BindingBehavior and ValueConverter expressions.
    */
  def evaluate(scope: Scope): js.Any = js.native
  def evaluate(scope: Scope, lookupFunctions: LookupFunctions): js.Any = js.native
}

