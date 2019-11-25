package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsStmts extends js.Object {
  var args: js.Array[Expression]
  var stmts: js.Array[Statement]
}

object Anon_ArgsStmts {
  @scala.inline
  def apply(args: js.Array[Expression], stmts: js.Array[Statement]): Anon_ArgsStmts = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsStmts]
  }
}

