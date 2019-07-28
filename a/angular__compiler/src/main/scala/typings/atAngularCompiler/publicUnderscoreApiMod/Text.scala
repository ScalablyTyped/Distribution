package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Text")
@js.native
class Text protected ()
  extends typings.atAngularCompiler.srcCompilerMod.Text {
  def this(value: String, sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(
    value: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

