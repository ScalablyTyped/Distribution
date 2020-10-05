package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "NonNullAssert")
@js.native
class NonNullAssert protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expression: AST) = this()
  var expression: AST = js.native
}

