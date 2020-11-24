package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "AstMemoryEfficientTransformer")
@js.native
class AstMemoryEfficientTransformer () extends AstVisitor {
  
  def visitAll(asts: js.Array[_]): js.Array[_] = js.native
  
  @JSName("visitThisReceiver")
  def visitThisReceiver_MAstMemoryEfficientTransformer(ast: ThisReceiver, context: js.Any): AST = js.native
  
  @JSName("visitUnary")
  def visitUnary_MAstMemoryEfficientTransformer(ast: Unary, context: js.Any): AST = js.native
}
