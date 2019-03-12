package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetBinding extends js.Object {
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: aureliaDashBindingLib.aureliaDashBindingMod.Expression
  /**
    * Connects the binding to a scope.
    */
  def bind(source: aureliaDashBindingLib.aureliaDashBindingMod.Scope): scala.Unit
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): scala.Unit
  /**
    * Assigns a value to the target.
    */
  def updateTarget(value: js.Any): scala.Unit
}

object LetBinding {
  @scala.inline
  def apply(
    bind: aureliaDashBindingLib.aureliaDashBindingMod.Scope => scala.Unit,
    sourceExpression: aureliaDashBindingLib.aureliaDashBindingMod.Expression,
    unbind: () => scala.Unit,
    updateTarget: js.Any => scala.Unit
  ): LetBinding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), sourceExpression = sourceExpression, unbind = js.Any.fromFunction0(unbind), updateTarget = js.Any.fromFunction1(updateTarget))
  
    __obj.asInstanceOf[LetBinding]
  }
}

