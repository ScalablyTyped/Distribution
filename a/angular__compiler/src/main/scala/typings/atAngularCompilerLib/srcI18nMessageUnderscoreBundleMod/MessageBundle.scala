package typings
package atAngularCompilerLib.srcI18nMessageUnderscoreBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/message_bundle", "MessageBundle")
@js.native
class MessageBundle protected () extends js.Object {
  def this(_htmlParser: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser, _implicitTags: js.Array[java.lang.String], _implicitAttrs: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]) = this()
  def this(_htmlParser: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser, _implicitTags: js.Array[java.lang.String], _implicitAttrs: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]], _locale: java.lang.String) = this()
  var _htmlParser: js.Any = js.native
  var _implicitAttrs: js.Any = js.native
  var _implicitTags: js.Any = js.native
  var _locale: js.Any = js.native
  var _messages: js.Any = js.native
  def getMessages(): js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message] = js.native
  def updateFromTemplate(
    html: java.lang.String,
    url: java.lang.String,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError] = js.native
  def write(serializer: atAngularCompilerLib.srcI18nSerializersSerializerMod.Serializer): java.lang.String = js.native
  def write(
    serializer: atAngularCompilerLib.srcI18nSerializersSerializerMod.Serializer,
    filterSources: js.Function1[/* path */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
}

