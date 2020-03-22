package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Text")
@js.native
class Text protected () extends NodeWithI18n {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, sourceSpan: ParseSourceSpan, i18n: I18nMeta) = this()
  var value: String = js.native
}

