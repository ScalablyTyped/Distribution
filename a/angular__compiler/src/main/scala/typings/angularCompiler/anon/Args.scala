package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[typings.angularCompiler.outputAstMod.Expression]
  var stmts: js.Array[Statement]
}

object Args {
  @scala.inline
  def apply(args: js.Array[typings.angularCompiler.outputAstMod.Expression], stmts: js.Array[Statement]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

