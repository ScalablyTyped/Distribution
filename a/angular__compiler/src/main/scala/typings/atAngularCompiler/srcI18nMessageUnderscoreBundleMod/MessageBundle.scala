package typings.atAngularCompiler.srcI18nMessageUnderscoreBundleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nSerializersSerializerMod.Serializer
import typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/message_bundle", "MessageBundle")
@js.native
class MessageBundle protected () extends js.Object {
  def this(
    _htmlParser: HtmlParser,
    _implicitTags: js.Array[String],
    _implicitAttrs: StringDictionary[js.Array[String]]
  ) = this()
  def this(
    _htmlParser: HtmlParser,
    _implicitTags: js.Array[String],
    _implicitAttrs: StringDictionary[js.Array[String]],
    _locale: String
  ) = this()
  var _htmlParser: js.Any = js.native
  var _implicitAttrs: js.Any = js.native
  var _implicitTags: js.Any = js.native
  var _locale: js.Any = js.native
  var _messages: js.Any = js.native
  def getMessages(): js.Array[Message] = js.native
  def updateFromTemplate(html: String, url: String, interpolationConfig: InterpolationConfig): js.Array[ParseError] = js.native
  def write(serializer: Serializer): String = js.native
  def write(serializer: Serializer, filterSources: js.Function1[/* path */ String, String]): String = js.native
}

