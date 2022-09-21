package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var elements: /* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any
}
object Elements {
  
  inline def apply(elements: /* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any): Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setElements(value: /* import warning: importer.ImportType#apply Failed type conversion: infer E */ js.Any): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
  }
}
