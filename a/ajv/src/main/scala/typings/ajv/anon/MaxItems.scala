package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxItems[T] extends StObject {
  
  var maxItems: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
}
object MaxItems {
  
  inline def apply[T](
    maxItems: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  ): MaxItems[T] = {
    val __obj = js.Dynamic.literal(maxItems = maxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxItems[T]]
  }
  
  extension [Self <: MaxItems[?], T](x: Self & MaxItems[T]) {
    
    inline def setMaxItems(value: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
  }
}
