package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "SafeMethodCall")
@js.native
class SafeMethodCall protected () extends ASTWithName {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    nameSpan: AbsoluteSourceSpan,
    receiver: AST,
    name: String,
    args: js.Array[_]
  ) = this()
  
  var args: js.Array[_] = js.native
  
  var name: String = js.native
  
  var receiver: AST = js.native
}
