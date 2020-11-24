package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "ASTWithName")
@js.native
abstract class ASTWithName protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, nameSpan: AbsoluteSourceSpan) = this()
  
  var nameSpan: AbsoluteSourceSpan = js.native
}
