package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "WriteKeyExpr")
@js.native
class WriteKeyExpr protected () extends Expression {
  def this(receiver: Expression, index: Expression, value: Expression) = this()
  def this(receiver: Expression, index: Expression, value: Expression, `type`: Type) = this()
  def this(
    receiver: Expression,
    index: Expression,
    value: Expression,
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    index: Expression,
    value: Expression,
    `type`: Unit,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    receiver: Expression,
    index: Expression,
    value: Expression,
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  
  var index: Expression = js.native
  
  var receiver: Expression = js.native
  
  var value: Expression = js.native
}
