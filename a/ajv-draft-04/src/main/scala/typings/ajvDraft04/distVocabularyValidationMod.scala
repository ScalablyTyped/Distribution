package typings.ajvDraft04

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.distVocabulariesValidationConstMod.ConstError
import typings.ajv.distVocabulariesValidationEnumMod.EnumError
import typings.ajv.distVocabulariesValidationMultipleOfMod.MultipleOfError
import typings.ajv.distVocabulariesValidationPatternMod.PatternError
import typings.ajv.distVocabulariesValidationRequiredMod.RequiredError
import typings.ajv.distVocabulariesValidationUniqueItemsMod.UniqueItemsError
import typings.ajvDraft04.ajvDraft04Strings.maxItems
import typings.ajvDraft04.ajvDraft04Strings.maxLength
import typings.ajvDraft04.ajvDraft04Strings.maxProperties
import typings.ajvDraft04.ajvDraft04Strings.minItems
import typings.ajvDraft04.ajvDraft04Strings.minLength
import typings.ajvDraft04.ajvDraft04Strings.minProperties
import typings.ajvDraft04.anon.Data
import typings.ajvDraft04.anon.Limit
import typings.ajvDraft04.distVocabularyValidationLimitNumberMod.LimitNumberError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabularyValidationMod extends Shortcut {
  
  @JSImport("ajv-draft-04/dist/vocabulary/validation", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type LimitError = ErrorObject[
    maxItems | minItems | minProperties | maxProperties | minLength | maxLength, 
    Limit, 
    Double | Data
  ]
  
  type ValidationKeywordError = LimitError | LimitNumberError | MultipleOfError | PatternError | RequiredError | UniqueItemsError | ConstError | EnumError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `distVocabularyValidationMod.foo` */
  override def _to: Vocabulary = default
}
