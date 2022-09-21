package typings.ajv

import typings.ajv.anon.NullableType
import typings.ajv.codeMod.Code
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.KeywordErrorCxt
import typings.ajv.distTypesMod.KeywordErrorDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typeError(t: String): KeywordErrorDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("typeError")(t.asInstanceOf[js.Any]).asInstanceOf[KeywordErrorDefinition]
  
  inline def typeErrorMessage(hasParentSchema: KeywordErrorCxt, t: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("typeErrorMessage")(hasParentSchema.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def typeErrorParams(hasParentSchema: KeywordErrorCxt, t: String): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("typeErrorParams")(hasParentSchema.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  type JTDTypeError[K /* <: String */, T /* <: String */, S] = ErrorObject[K, NullableType[T], S]
}
