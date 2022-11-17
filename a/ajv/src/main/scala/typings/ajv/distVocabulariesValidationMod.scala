package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.anon.Data
import typings.ajv.anon.Limit
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.distVocabulariesValidationConstMod.ConstError
import typings.ajv.distVocabulariesValidationEnumMod.EnumError
import typings.ajv.distVocabulariesValidationLimitNumberMod.LimitNumberError
import typings.ajv.distVocabulariesValidationMultipleOfMod.MultipleOfError
import typings.ajv.distVocabulariesValidationPatternMod.PatternError
import typings.ajv.distVocabulariesValidationRequiredMod.RequiredError
import typings.ajv.distVocabulariesValidationUniqueItemsMod.UniqueItemsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type LimitError = ErrorObject[
    "maxItems" | "minItems" | "minProperties" | "maxProperties" | "minLength" | "maxLength", 
    Limit, 
    Double | Data
  ]
  
  type ValidationKeywordError = LimitError | LimitNumberError | MultipleOfError | PatternError | RequiredError | UniqueItemsError | ConstError | EnumError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationMod.foo` */
  override def _to: Vocabulary = default
}
