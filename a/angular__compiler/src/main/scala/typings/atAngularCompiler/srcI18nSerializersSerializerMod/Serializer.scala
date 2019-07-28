package typings.atAngularCompiler.srcI18nSerializersSerializerMod

import typings.atAngularCompiler.Anon_I18nNodesByMsgId
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/serializer", "Serializer")
@js.native
abstract class Serializer () extends js.Object {
  def createNameMapper(message: Message): PlaceholderMapper | Null = js.native
  def digest(message: Message): String = js.native
  def load(content: String, url: String): Anon_I18nNodesByMsgId = js.native
  def write(messages: js.Array[Message]): String = js.native
  def write(messages: js.Array[Message], locale: String): String = js.native
}

