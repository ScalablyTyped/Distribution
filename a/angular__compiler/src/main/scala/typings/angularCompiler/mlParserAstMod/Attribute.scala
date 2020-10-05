package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/ast", "Attribute")
@js.native
class Attribute protected () extends NodeWithI18n {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, valueSpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: js.UndefOr[scala.Nothing],
    i18n: I18nMeta
  ) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
  var name: String = js.native
  var value: String = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}

