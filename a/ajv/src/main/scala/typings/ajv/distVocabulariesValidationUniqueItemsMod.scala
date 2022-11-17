package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.anon.Data
import typings.ajv.anon.I
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationUniqueItemsMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/uniqueItems", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type UniqueItemsError = ErrorObject["uniqueItems", I, Boolean | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationUniqueItemsMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
