package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Attribute")
@js.native
class Attribute protected () extends Node {
  def this(name: java.lang.String, value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, valueSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var name: java.lang.String = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var value: java.lang.String = js.native
  var valueSpan: js.UndefOr[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan] = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

