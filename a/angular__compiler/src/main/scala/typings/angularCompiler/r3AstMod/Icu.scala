package typings.angularCompiler.r3AstMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Icu")
@js.native
class Icu protected () extends Node {
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan,
    i18n: typings.angularCompiler.i18nAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typings.angularCompiler.i18nAstMod.Node] = js.native
  var placeholders: StringDictionary[Text | BoundText] = js.native
  var vars: StringDictionary[BoundText] = js.native
}

