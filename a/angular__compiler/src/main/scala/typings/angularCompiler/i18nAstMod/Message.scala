package typings.angularCompiler.i18nAstMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "Message")
@js.native
class Message protected () extends I18nMeta {
  /**
    * @param nodes message AST
    * @param placeholders maps placeholder names to static content
    * @param placeholderToMessage maps placeholder names to messages (used for nested ICU messages)
    * @param meaning
    * @param description
    * @param customId
    */
  def this(
    nodes: js.Array[Node],
    placeholders: StringDictionary[String],
    placeholderToMessage: StringDictionary[Message],
    meaning: String,
    description: String,
    customId: String
  ) = this()
  var customId: String = js.native
  var description: String = js.native
  var id: String = js.native
  /** The ids to use if there are no custom id and if `i18nLegacyMessageIdFormat` is not empty */
  var legacyIds: js.Array[String] = js.native
  var meaning: String = js.native
  var nodes: js.Array[Node] = js.native
  var placeholderToMessage: StringDictionary[Message] = js.native
  var placeholders: StringDictionary[String] = js.native
  var sources: js.Array[MessageSpan] = js.native
}

