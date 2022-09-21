package typings.ajv.anon

import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Const[T]
  extends StObject
     with typings.ajv.jsonSchemaMod.Nullable[T] {
  
  var default: js.UndefOr[T | Null] = js.undefined
  
  var const: js.UndefOr[Null] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[T | Null]] = js.undefined
  
  var nullable: `true`
}
object Const {
  
  inline def apply[T](): Const[T] = {
    val __obj = js.Dynamic.literal(nullable = true)
    __obj.asInstanceOf[Const[T]]
  }
  
  extension [Self <: Const[?], T](x: Self & Const[T]) {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setEnum(value: js.Array[T | Null]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: (T | Null)*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setNullable(value: `true`): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
  }
}
