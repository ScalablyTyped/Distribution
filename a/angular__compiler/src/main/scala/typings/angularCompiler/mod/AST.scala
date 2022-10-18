package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/compiler", "AST")
@js.native
open class AST protected () extends StObject {
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
  
  def visit(visitor: AstVisitor): Any = js.native
  def visit(visitor: AstVisitor, context: Any): Any = js.native
}
