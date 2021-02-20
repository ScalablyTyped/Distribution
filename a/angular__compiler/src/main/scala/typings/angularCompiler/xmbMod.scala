package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmbMod {
  
  @JSImport("@angular/compiler/src/i18n/serializers/xmb", "Xmb")
  @js.native
  class Xmb () extends Serializer
  
  @JSImport("@angular/compiler/src/i18n/serializers/xmb", "digest")
  @js.native
  def digest(message: Message): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/serializers/xmb", "toPublicName")
  @js.native
  def toPublicName(internalName: String): String = js.native
}
