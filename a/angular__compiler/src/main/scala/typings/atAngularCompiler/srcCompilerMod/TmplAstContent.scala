package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Content
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstContent")
@js.native
class TmplAstContent protected () extends Content {
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

