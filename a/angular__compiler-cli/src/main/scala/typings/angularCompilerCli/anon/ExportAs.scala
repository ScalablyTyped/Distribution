package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAs extends StObject {
  
  var exportAs: js.Array[String] | Null
  
  var selector: String | Null
}
object ExportAs {
  
  inline def apply(): ExportAs = {
    val __obj = js.Dynamic.literal(exportAs = null, selector = null)
    __obj.asInstanceOf[ExportAs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportAs] (val x: Self) extends AnyVal {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
  }
}
