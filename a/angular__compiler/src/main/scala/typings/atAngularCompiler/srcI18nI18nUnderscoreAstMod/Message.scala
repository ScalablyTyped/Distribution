package typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "Message")
@js.native
class Message protected () extends AST {
  /**
    * @param nodes message AST
    * @param placeholders maps placeholder names to static content
    * @param placeholderToMessage maps placeholder names to messages (used for nested ICU messages)
    * @param meaning
    * @param description
    * @param id
    */
  def this(
    nodes: js.Array[Node],
    placeholders: StringDictionary[String],
    placeholderToMessage: StringDictionary[Message],
    meaning: String,
    description: String,
    id: String
  ) = this()
  var description: String = js.native
  var id: String = js.native
  var meaning: String = js.native
  var nodes: js.Array[Node] = js.native
  var placeholderToMessage: StringDictionary[Message] = js.native
  var placeholders: StringDictionary[String] = js.native
  var sources: js.Array[MessageSpan] = js.native
}

