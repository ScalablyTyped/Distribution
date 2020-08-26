package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected () extends Expression {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: MapType) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: MapType, sourceSpan: ParseSourceSpan) = this()
  var entries: js.Array[LiteralMapEntry] = js.native
  var valueType: Type | Null = js.native
}

