package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "Unparser")
@js.native
class Unparser protected () extends ExpressionVisitor {
  def this(buffer: js.Array[String]) = this()
}

