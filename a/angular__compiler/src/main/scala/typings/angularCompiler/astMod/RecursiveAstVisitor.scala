package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "RecursiveAstVisitor")
@js.native
class RecursiveAstVisitor () extends AstVisitor {
  
  def visitAll(asts: js.Array[AST], context: js.Any): js.Any = js.native
  
  def visitImplicitReceiver(ast: ThisReceiver, context: js.Any): js.Any = js.native
  
  @JSName("visitThisReceiver")
  def visitThisReceiver_MRecursiveAstVisitor(ast: ThisReceiver, context: js.Any): js.Any = js.native
  
  @JSName("visitUnary")
  def visitUnary_MRecursiveAstVisitor(ast: Unary, context: js.Any): js.Any = js.native
  
  @JSName("visit")
  def visit_MRecursiveAstVisitor(ast: AST): js.Any = js.native
  @JSName("visit")
  def visit_MRecursiveAstVisitor(ast: AST, context: js.Any): js.Any = js.native
}
