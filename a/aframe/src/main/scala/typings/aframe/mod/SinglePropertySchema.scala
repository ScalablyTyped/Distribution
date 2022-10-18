package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinglePropertySchema[T]
  extends StObject
     with Schema_[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var parse: js.UndefOr[js.Function1[/* value */ String, T]] = js.undefined
  
  var stringify: js.UndefOr[js.Function1[/* value */ T, String]] = js.undefined
  
  var `type`: js.UndefOr[PropertyTypes] = js.undefined
}
object SinglePropertySchema {
  
  inline def apply[T](): SinglePropertySchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SinglePropertySchema[T]]
  }
  
  extension [Self <: SinglePropertySchema[?], T](x: Self & SinglePropertySchema[T]) {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setParse(value: /* value */ String => T): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setStringify(value: /* value */ T => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    inline def setType(value: PropertyTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
