package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Icu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icuSerializerMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/icu_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def serializeIcuNode(icu: Icu): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeIcuNode")(icu.asInstanceOf[js.Any]).asInstanceOf[String]
}
