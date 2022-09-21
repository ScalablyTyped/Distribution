package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var values: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
}
object Values {
  
  inline def apply(values: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any): Values = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  extension [Self <: Values](x: Self) {
    
    inline def setValues(value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
