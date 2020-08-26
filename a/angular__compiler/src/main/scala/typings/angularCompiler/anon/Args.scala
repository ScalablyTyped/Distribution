package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[typings.angularCompiler.outputAstMod.Expression] = js.native
  var stmts: js.Array[Statement] = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[typings.angularCompiler.outputAstMod.Expression], stmts: js.Array[Statement]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: typings.angularCompiler.outputAstMod.Expression*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[typings.angularCompiler.outputAstMod.Expression]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setStmtsVarargs(value: Statement*): Self = this.set("stmts", js.Array(value :_*))
    @scala.inline
    def setStmts(value: js.Array[Statement]): Self = this.set("stmts", value.asInstanceOf[js.Any])
  }
  
}

