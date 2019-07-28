package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Expansion")
@js.native
class Expansion protected ()
  extends typings.atAngularCompiler.srcCompilerMod.Expansion {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typings.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typings.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typings.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

