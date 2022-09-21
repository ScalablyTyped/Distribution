package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[T]
  extends StObject
     with typings.ajv.jsonSchemaMod.Nullable[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var const: js.UndefOr[T] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[T]] = js.undefined
}
object Default {
  
  inline def apply[T](): Default[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Default[T]]
  }
  
  extension [Self <: Default[?], T](x: Self & Default[T]) {
    
    inline def setConst(value: T): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setEnum(value: js.Array[T]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: T*): Self = StObject.set(x, "enum", js.Array(value*))
  }
}
