package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length[T] extends StObject {
  
  var length: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
}
object Length {
  
  inline def apply[T](length: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any): Length[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length[T]]
  }
  
  extension [Self <: Length[?], T](x: Self & Length[T]) {
    
    inline def setLength(value: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
