package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Text")
@js.native
class Text protected () extends Node {
  def this(value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  var i18n: js.UndefOr[
    atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message | atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node
  ] = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var value: java.lang.String = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

