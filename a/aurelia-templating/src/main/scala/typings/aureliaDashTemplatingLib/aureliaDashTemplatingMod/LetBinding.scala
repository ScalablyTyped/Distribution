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
    bind: js.Function1[aureliaDashBindingLib.aureliaDashBindingMod.Scope, scala.Unit],
    sourceExpression: aureliaDashBindingLib.aureliaDashBindingMod.Expression,
    unbind: js.Function0[scala.Unit],
    updateTarget: js.Function1[js.Any, scala.Unit]
  ): LetBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("sourceExpression")(sourceExpression)
    __obj.updateDynamic("unbind")(unbind)
    __obj.updateDynamic("updateTarget")(updateTarget)
    __obj.asInstanceOf[LetBinding]
  }
}

