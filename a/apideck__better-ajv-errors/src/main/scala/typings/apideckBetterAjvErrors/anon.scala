package typings.apideckBetterAjvErrors

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.distVocabulariesValidationLimitNumberMod.Kwd
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.`enum`
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.`false schema`
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.`if`
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.`type`
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.additionalItems
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.additionalProperties
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.anyOf
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.const
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.contains
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.dependencies
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.dependentRequired
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.discriminator
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.format
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.items
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.maxItems
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.maxLength
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.maxProperties
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.minItems
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.minLength
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.minProperties
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.multipleOf
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.not
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.oneOf
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.pattern
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.propertyNames
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.required
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.unevaluatedItems
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.unevaluatedProperties
import typings.apideckBetterAjvErrors.apideckBetterAjvErrorsStrings.uniqueItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictadditionalContext
    extends StObject
       with /* additionalContext */ StringDictionary[Any] {
    
    var errorType: `type` | (`false schema`) | additionalItems | items | contains | additionalProperties | dependencies | `if` | anyOf | oneOf | not | propertyNames | maxItems | minItems | minProperties | maxProperties | minLength | maxLength | Kwd | multipleOf | pattern | required | uniqueItems | const | `enum` | format | unevaluatedProperties | unevaluatedItems | dependentRequired | discriminator
  }
  object DictadditionalContext {
    
    inline def apply(
      errorType: `type` | (`false schema`) | additionalItems | items | contains | additionalProperties | dependencies | `if` | anyOf | oneOf | not | propertyNames | maxItems | minItems | minProperties | maxProperties | minLength | maxLength | Kwd | multipleOf | pattern | required | uniqueItems | const | `enum` | format | unevaluatedProperties | unevaluatedItems | dependentRequired | discriminator
    ): DictadditionalContext = {
      val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictadditionalContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictadditionalContext] (val x: Self) extends AnyVal {
      
      inline def setErrorType(
        value: `type` | (`false schema`) | additionalItems | items | contains | additionalProperties | dependencies | `if` | anyOf | oneOf | not | propertyNames | maxItems | minItems | minProperties | maxProperties | minLength | maxLength | Kwd | multipleOf | pattern | required | uniqueItems | const | `enum` | format | unevaluatedProperties | unevaluatedItems | dependentRequired | discriminator
      ): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fallback[T] extends StObject {
    
    var fallback: T
    
    var `object`: Any
    
    var pnter: String
  }
  object Fallback {
    
    inline def apply[T](fallback: T, `object`: Any, pnter: String): Fallback[T] = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], pnter = pnter.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fallback[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fallback[?], T] (val x: Self & Fallback[T]) extends AnyVal {
      
      inline def setFallback(value: T): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPnter(value: String): Self = StObject.set(x, "pnter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[js.Function1[/* suggestion */ String, String]] = js.undefined
    
    var suggestions: js.Array[String]
    
    var value: String | Null
  }
  object Format {
    
    inline def apply(suggestions: js.Array[String]): Format = {
      val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: /* suggestion */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
