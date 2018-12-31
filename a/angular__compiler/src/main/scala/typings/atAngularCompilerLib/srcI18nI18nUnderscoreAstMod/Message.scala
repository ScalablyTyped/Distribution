package typings
package atAngularCompilerLib.srcI18nI18nUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "Message")
@js.native
class Message protected () extends js.Object {
  /**
    * @param nodes message AST
    * @param placeholders maps placeholder names to static content
    * @param placeholderToMessage maps placeholder names to messages (used for nested ICU messages)
    * @param meaning
    * @param description
    * @param id
    */
  def this(nodes: js.Array[Node], placeholders: org.scalablytyped.runtime.StringDictionary[java.lang.String], placeholderToMessage: org.scalablytyped.runtime.StringDictionary[Message], meaning: java.lang.String, description: java.lang.String, id: java.lang.String) = this()
  var description: java.lang.String = js.native
  var id: java.lang.String = js.native
  var meaning: java.lang.String = js.native
  var nodes: js.Array[Node] = js.native
  var placeholderToMessage: org.scalablytyped.runtime.StringDictionary[Message] = js.native
  var placeholders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var sources: js.Array[MessageSpan] = js.native
}

