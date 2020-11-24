package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.htmlParserMod.HtmlParser
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.serializerMod.Serializer
import typings.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n/message_bundle", JSImport.Namespace)
@js.native
object messageBundleMod extends js.Object {
  
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
}
