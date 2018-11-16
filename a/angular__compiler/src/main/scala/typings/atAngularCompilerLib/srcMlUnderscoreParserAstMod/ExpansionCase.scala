package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "ExpansionCase")
@js.native
class ExpansionCase protected () extends Node {
  def this(value: java.lang.String, expression: js.Array[Node], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, valueSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, expSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var expSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var expression: js.Array[Node] = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var value: java.lang.String = js.native
  var valueSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

