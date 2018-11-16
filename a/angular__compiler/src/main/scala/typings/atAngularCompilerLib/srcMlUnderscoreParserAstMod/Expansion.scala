package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Expansion")
@js.native
class Expansion protected () extends Node {
  def this(switchValue: java.lang.String, `type`: java.lang.String, cases: js.Array[ExpansionCase], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, switchValueSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var cases: js.Array[ExpansionCase] = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var switchValue: java.lang.String = js.native
  var switchValueSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

