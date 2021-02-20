package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "AST")
@js.native
class AST protected () extends StObject {
  def this(
    span: ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: AbsoluteSourceSpan
  ) = this()
  
  /**
    * Absolute location of the expression AST in a source code file.
    */
  var sourceSpan: AbsoluteSourceSpan = js.native
  
  var span: ParseSpan = js.native
  
  def visit(visitor: AstVisitor): js.Any = js.native
  def visit(visitor: AstVisitor, context: js.Any): js.Any = js.native
}
