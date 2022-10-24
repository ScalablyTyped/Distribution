package typings.ajv

import typings.ajv.anon.Nullable
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.KeywordErrorCxt
import typings.ajv.distTypesMod.KeywordErrorDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdErrorMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typeError(t: String): KeywordErrorDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("typeError")(t.asInstanceOf[js.Any]).asInstanceOf[KeywordErrorDefinition]
  
  inline def typeErrorMessage(param0: KeywordErrorCxt, t: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("typeErrorMessage")(param0.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def typeErrorParams(param0: KeywordErrorCxt, t: String): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("typeErrorParams")(param0.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  type JTDTypeError[K /* <: String */, T /* <: String */, S] = ErrorObject[K, Nullable[T], S]
}
