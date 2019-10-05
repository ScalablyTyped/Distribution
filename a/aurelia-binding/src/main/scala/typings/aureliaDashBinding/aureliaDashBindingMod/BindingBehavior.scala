package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "BindingBehavior")
@js.native
class BindingBehavior protected () extends Expression {
  def this(expression: Expression, name: String, args: js.Array[Expression]) = this()
  var args: js.Array[Expression] = js.native
  var expression: Expression = js.native
  var name: String = js.native
}

@JSImport("aurelia-binding", "bindingBehavior")
@js.native
object bindingBehavior extends js.Object {
  def apply(name: String): js.Any = js.native
}

