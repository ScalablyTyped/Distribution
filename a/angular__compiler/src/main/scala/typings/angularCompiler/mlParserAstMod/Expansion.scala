package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/ast", "Expansion")
@js.native
class Expansion protected () extends NodeWithI18n {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
  
  var cases: js.Array[ExpansionCase] = js.native
  
  var switchValue: String = js.native
  
  var switchValueSourceSpan: ParseSourceSpan = js.native
  
  var `type`: String = js.native
}
