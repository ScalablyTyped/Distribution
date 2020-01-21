package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.Expression
import typings.aureliaBinding.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetBinding extends js.Object {
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: Expression
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit
  /**
    * Assigns a value to the target.
    */
  def updateTarget(value: js.Any): Unit
}

object LetBinding {
  @scala.inline
  def apply(
    bind: Scope => Unit,
    sourceExpression: Expression,
    unbind: () => Unit,
    updateTarget: js.Any => Unit
  ): LetBinding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), sourceExpression = sourceExpression.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind), updateTarget = js.Any.fromFunction1(updateTarget))
  
    __obj.asInstanceOf[LetBinding]
  }
}

