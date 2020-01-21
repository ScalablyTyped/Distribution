package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Expansion")
@js.native
class Expansion protected ()
  extends typings.angularCompiler.mlParserAstMod.Expansion {
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
    i18n: Message
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[typings.angularCompiler.mlParserAstMod.ExpansionCase],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    switchValueSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

