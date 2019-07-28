package typings.atAngularCompiler.srcRender3R3UnderscoreAstMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
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
    i18n: typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  var placeholders: StringDictionary[Text | BoundText] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var vars: StringDictionary[BoundText] = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

