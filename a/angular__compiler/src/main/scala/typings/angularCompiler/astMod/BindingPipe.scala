package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "BindingPipe")
@js.native
class BindingPipe protected () extends ASTWithName {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    exp: AST,
    name: String,
    args: js.Array[js.Any],
    nameSpan: AbsoluteSourceSpan
  ) = this()
  
  var args: js.Array[js.Any] = js.native
  
  var exp: AST = js.native
  
  var name: String = js.native
}
