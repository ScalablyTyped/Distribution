package typings
package atAngularCompilerLib.srcI18nSerializersSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/serializer", "Serializer")
@js.native
abstract class Serializer () extends js.Object {
  def createNameMapper(message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message): PlaceholderMapper | scala.Null = js.native
  def digest(message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message): java.lang.String = js.native
  def load(content: java.lang.String, url: java.lang.String): atAngularCompilerLib.Anon_I18nNodesByMsgId = js.native
  def write(messages: js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message]): java.lang.String = js.native
  def write(
    messages: js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message],
    locale: java.lang.String
  ): java.lang.String = js.native
}

