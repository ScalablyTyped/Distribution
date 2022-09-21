package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.unevaluatedItems
import typings.ajv.anon.Limit
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unevaluatedItemsMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/unevaluated/unevaluatedItems", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type UnevaluatedItemsError = ErrorObject[unevaluatedItems, Limit, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `unevaluatedItemsMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
