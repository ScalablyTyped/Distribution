package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "MessageBundle")
@js.native
class MessageBundle protected ()
  extends typings.angularCompiler.publicApiMod.MessageBundle {
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _implicitTags: js.Array[String],
    _implicitAttrs: StringDictionary[js.Array[String]]
  ) = this()
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _implicitTags: js.Array[String],
    _implicitAttrs: StringDictionary[js.Array[String]],
    _locale: String
  ) = this()
}

