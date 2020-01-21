package typings.angularCompiler.publicApiMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Text")
@js.native
class Text protected ()
  extends typings.angularCompiler.srcCompilerMod.Text {
  def this(value: String, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(value: String, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Message) = this()
  def this(value: String, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, i18n: Node) = this()
}

