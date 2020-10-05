package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ReadPropExpr")
@js.native
class ReadPropExpr protected () extends Expression {
  def this(receiver: Expression, name: String) = this()
  def this(receiver: Expression, name: String, `type`: Type) = this()
  def this(receiver: Expression, name: String, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, name: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, name: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var receiver: Expression = js.native
  def set(value: Expression): WritePropExpr = js.native
}

