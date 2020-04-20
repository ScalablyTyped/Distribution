package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[Expression]
  var stmts: js.Array[Statement]
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[Expression], stmts: js.Array[Statement]): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

