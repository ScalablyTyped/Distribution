package typings.angularCompiler.publicApiMod

import typings.angularCompiler.i18nAstMod.I18nMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Expansion")
@js.native
class Expansion protected ()
  extends typings.angularCompiler.srcCompilerMod.Expansion {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typings.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typings.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: I18nMeta
  ) = this()
}

