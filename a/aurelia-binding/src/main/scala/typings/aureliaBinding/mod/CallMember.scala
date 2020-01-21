package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "CallMember")
@js.native
class CallMember protected () extends Expression {
  def this(`object`: Expression, name: String, args: js.Array[Expression]) = this()
  var args: js.Array[Expression] = js.native
  var name: String = js.native
  var `object`: Expression = js.native
}

