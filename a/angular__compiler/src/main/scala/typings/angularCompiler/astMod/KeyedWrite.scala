package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "KeyedWrite")
@js.native
class KeyedWrite protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, obj: AST, key: AST, value: AST) = this()
  var key: AST = js.native
  var obj: AST = js.native
  var value: AST = js.native
}

