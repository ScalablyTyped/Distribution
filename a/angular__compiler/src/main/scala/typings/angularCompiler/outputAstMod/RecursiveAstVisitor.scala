package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "RecursiveAstVisitor")
@js.native
class RecursiveAstVisitor ()
  extends StatementVisitor
     with ExpressionVisitor {
  
  def visitAllExpressions(exprs: js.Array[Expression], context: js.Any): Unit = js.native
  
  def visitAllStatements(stmts: js.Array[Statement], context: js.Any): Unit = js.native
  
  def visitArrayType(`type`: ArrayType, context: js.Any): js.Any = js.native
  
  def visitBuiltinType(`type`: BuiltinType, context: js.Any): js.Any = js.native
  
  def visitExpression(ast: Expression, context: js.Any): js.Any = js.native
  
  def visitExpressionType(`type`: ExpressionType_, context: js.Any): js.Any = js.native
  
  def visitMapType(`type`: MapType, context: js.Any): js.Any = js.native
  
  def visitType(ast: Type, context: js.Any): js.Any = js.native
}
