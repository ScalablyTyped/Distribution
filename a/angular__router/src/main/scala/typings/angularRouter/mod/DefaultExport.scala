package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultExport[T] extends StObject {
  
  /**
    * Default exports are bound under the name `"default"`, per the ES Module spec:
    * https://tc39.es/ecma262/#table-export-forms-mapping-to-exportentry-records
    */
  var default: T
}
object DefaultExport {
  
  inline def apply[T](default: T): DefaultExport[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultExport[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultExport[?], T] (val x: Self & DefaultExport[T]) extends AnyVal {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
