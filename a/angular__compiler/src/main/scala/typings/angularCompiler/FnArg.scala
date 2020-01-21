package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnArg extends js.Object {
  def apply[T](arg: Expression): scala.Nothing = js.native
  def apply[T](arg: Statement): scala.Nothing = js.native
  def apply[T](arg: Node): scala.Nothing = js.native
}

