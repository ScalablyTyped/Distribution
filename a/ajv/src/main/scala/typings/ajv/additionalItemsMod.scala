package typings.ajv

import typings.ajv.ajvStrings.additionalItems
import typings.ajv.anon.Limit
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.validateMod.KeywordCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object additionalItemsMod {
  
  @JSImport("ajv/dist/vocabularies/applicator/additionalItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/applicator/additionalItems", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def validateAdditionalItems(cxt: KeywordCxt, items: js.Array[AnySchema]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAdditionalItems")(cxt.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AdditionalItemsError = ErrorObject[additionalItems, Limit, AnySchema]
}
