package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.multipleOf
import typings.ajv.anon.Data
import typings.ajv.anon.MultipleOf
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationMultipleOfMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/multipleOf", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type MultipleOfError = ErrorObject[multipleOf, MultipleOf, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationMultipleOfMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
