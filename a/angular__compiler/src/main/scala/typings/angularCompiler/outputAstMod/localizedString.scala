package typings.angularCompiler.outputAstMod

import typings.angularCompiler.metaMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "localizedString")
@js.native
object localizedString extends js.Object {
  def apply(
    metaBlock: I18nMeta,
    messageParts: js.Array[String],
    placeholderNames: js.Array[String],
    expressions: js.Array[Expression]
  ): LocalizedString_ = js.native
  def apply(
    metaBlock: I18nMeta,
    messageParts: js.Array[String],
    placeholderNames: js.Array[String],
    expressions: js.Array[Expression],
    sourceSpan: ParseSourceSpan
  ): LocalizedString_ = js.native
}

