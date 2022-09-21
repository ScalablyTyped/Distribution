package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "MessageBundle")
@js.native
open class MessageBundle protected () extends StObject {
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
  
  /* private */ var _htmlParser: Any = js.native
  
  /* private */ var _implicitAttrs: Any = js.native
  
  /* private */ var _implicitTags: Any = js.native
  
  /* private */ var _locale: Any = js.native
  
  /* private */ var _messages: Any = js.native
  
  def getMessages(): js.Array[Message] = js.native
  
  def updateFromTemplate(html: String, url: String, interpolationConfig: InterpolationConfig): js.Array[ParseError] = js.native
  
  def write(serializer: Serializer): String = js.native
  def write(serializer: Serializer, filterSources: js.Function1[/* path */ String, String]): String = js.native
}
