package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "Conditional")
@js.native
class Conditional protected () extends Expression {
  def this(condition: Expression, yes: Expression, no: Expression) = this()
  var condition: Expression = js.native
  var no: Expression = js.native
  var yes: Expression = js.native
}

