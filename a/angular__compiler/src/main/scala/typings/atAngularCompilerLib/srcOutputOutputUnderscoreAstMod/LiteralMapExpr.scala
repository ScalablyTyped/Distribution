package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected () extends Expression {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: MapType) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: MapType, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(entries: js.Array[LiteralMapEntry], `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var entries: js.Array[LiteralMapEntry] = js.native
  var valueType: Type | scala.Null = js.native
}

