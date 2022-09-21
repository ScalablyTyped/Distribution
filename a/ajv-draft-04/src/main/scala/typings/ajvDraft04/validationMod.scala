package typings.ajvDraft04

import org.scalablytyped.runtime.Shortcut
import typings.ajv.constMod.ConstError
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.multipleOfMod.MultipleOfError
import typings.ajv.patternMod.PatternError
import typings.ajv.requiredMod.RequiredError
import typings.ajv.uniqueItemsMod.UniqueItemsError
import typings.ajv.validationEnumMod.EnumError
import typings.ajvDraft04.ajvDraft04Strings.maxItems
import typings.ajvDraft04.ajvDraft04Strings.maxLength
import typings.ajvDraft04.ajvDraft04Strings.maxProperties
import typings.ajvDraft04.ajvDraft04Strings.minItems
import typings.ajvDraft04.ajvDraft04Strings.minLength
import typings.ajvDraft04.ajvDraft04Strings.minProperties
import typings.ajvDraft04.anon.Data
import typings.ajvDraft04.anon.Limit
import typings.ajvDraft04.limitNumberMod.LimitNumberError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod extends Shortcut {
  
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
  
  /* This means you don't have to write `default`, but can instead just say `validationMod.foo` */
  override def _to: Vocabulary = default
}
