package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "ValueConverter")
@js.native
class ValueConverter protected () extends Expression {
  def this(expression: Expression, name: String, args: js.Array[Expression], allArgs: js.Array[Expression]) = this()
  var allArgs: js.Array[Expression] = js.native
  var args: js.Array[Expression] = js.native
  var expression: Expression = js.native
  var name: String = js.native
}

@JSImport("aurelia-binding", "valueConverter")
@js.native
object valueConverter extends js.Object {
  def apply(name: String): js.Any = js.native
}

