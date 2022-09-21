package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.maxItems
import typings.ajv.ajvStrings.maxLength
import typings.ajv.ajvStrings.maxProperties
import typings.ajv.ajvStrings.minItems
import typings.ajv.ajvStrings.minLength
import typings.ajv.ajvStrings.minProperties
import typings.ajv.anon.Data
import typings.ajv.anon.Limit
import typings.ajv.constMod.ConstError
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Vocabulary
import typings.ajv.limitNumberMod.LimitNumberError
import typings.ajv.multipleOfMod.MultipleOfError
import typings.ajv.patternMod.PatternError
import typings.ajv.requiredMod.RequiredError
import typings.ajv.uniqueItemsMod.UniqueItemsError
import typings.ajv.validationEnumMod.EnumError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation", JSImport.Default)
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
