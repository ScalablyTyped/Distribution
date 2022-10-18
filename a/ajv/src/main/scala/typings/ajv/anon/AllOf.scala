package typings.ajv.anon

import typings.ajv.distTypesJsonSchemaMod.UncheckedPartialSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllOf[T] extends StObject {
  
  var allOf: js.UndefOr[js.Array[UncheckedPartialSchema[T]]] = js.undefined
  
  var anyOf: js.UndefOr[js.Array[UncheckedPartialSchema[T]]] = js.undefined
  
  var `else`: js.UndefOr[UncheckedPartialSchema[T]] = js.undefined
  
  var `if`: js.UndefOr[UncheckedPartialSchema[T]] = js.undefined
  
  var not: js.UndefOr[UncheckedPartialSchema[T]] = js.undefined
  
  var oneOf: js.UndefOr[js.Array[UncheckedPartialSchema[T]]] = js.undefined
  
  var `then`: js.UndefOr[UncheckedPartialSchema[T]] = js.undefined
}
object AllOf {
  
  inline def apply[T](): AllOf[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllOf[T]]
  }
  
  extension [Self <: AllOf[?], T](x: Self & AllOf[T]) {
    
    inline def setAllOf(value: js.Array[UncheckedPartialSchema[T]]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    inline def setAllOfVarargs(value: UncheckedPartialSchema[T]*): Self = StObject.set(x, "allOf", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[UncheckedPartialSchema[T]]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: UncheckedPartialSchema[T]*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setElse(value: UncheckedPartialSchema[T]): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
    
    inline def setIf(value: UncheckedPartialSchema[T]): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setNot(value: UncheckedPartialSchema[T]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOneOf(value: js.Array[UncheckedPartialSchema[T]]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setOneOfVarargs(value: UncheckedPartialSchema[T]*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setThen(value: UncheckedPartialSchema[T]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
