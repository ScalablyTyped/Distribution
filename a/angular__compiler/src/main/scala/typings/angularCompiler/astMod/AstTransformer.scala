package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "AstTransformer")
@js.native
class AstTransformer () extends AstVisitor {
  
  def visitAll(asts: js.Array[_]): js.Array[_] = js.native
  
  @JSName("visitThisReceiver")
  def visitThisReceiver_MAstTransformer(ast: ThisReceiver, context: js.Any): AST = js.native
  
  @JSName("visitUnary")
  def visitUnary_MAstTransformer(ast: Unary, context: js.Any): AST = js.native
}
