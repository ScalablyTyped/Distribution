package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmbMod {
  
  @JSImport("@angular/compiler/src/i18n/serializers/xmb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/i18n/serializers/xmb", "Xmb")
  @js.native
  class Xmb () extends Serializer
  
  inline def digest(message: Message): String = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toPublicName(internalName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPublicName")(internalName.asInstanceOf[js.Any]).asInstanceOf[String]
}
