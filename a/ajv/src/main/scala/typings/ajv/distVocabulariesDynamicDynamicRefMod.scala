package typings.ajv

import typings.ajv.distCompileValidateMod.KeywordCxt
import typings.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesDynamicDynamicRefMod {
  
  @JSImport("ajv/dist/vocabularies/dynamic/dynamicRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/dynamic/dynamicRef", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def dynamicRef(cxt: KeywordCxt, ref: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicRef")(cxt.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
