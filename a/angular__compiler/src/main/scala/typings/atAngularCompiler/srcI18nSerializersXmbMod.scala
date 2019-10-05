package typings.atAngularCompiler

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nSerializersSerializerMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/xmb", JSImport.Namespace)
@js.native
object srcI18nSerializersXmbMod extends js.Object {
  @js.native
  class Xmb () extends Serializer
  
  def digest(message: Message): String = js.native
  def toPublicName(internalName: String): String = js.native
}

