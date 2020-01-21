package typings.acorn.mod

import typings.estree.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "parseExpressionAt")
@js.native
object parseExpressionAt extends js.Object {
  def apply(input: String): Expression = js.native
  def apply(input: String, pos: Double): Expression = js.native
  def apply(input: String, pos: Double, options: Options): Expression = js.native
}

