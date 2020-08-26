package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "AstTransformer")
@js.native
class AstTransformer ()
  extends StatementVisitor
     with ExpressionVisitor {
  def transformExpr(expr: Expression, context: js.Any): Expression = js.native
  def transformStmt(stmt: Statement, context: js.Any): Statement = js.native
  def visitAllExpressions(exprs: js.Array[Expression], context: js.Any): js.Array[Expression] = js.native
  def visitAllStatements(stmts: js.Array[Statement], context: js.Any): js.Array[Statement] = js.native
}

