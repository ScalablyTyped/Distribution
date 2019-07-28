package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Expansion")
@js.native
class Expansion protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.Expansion {
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

