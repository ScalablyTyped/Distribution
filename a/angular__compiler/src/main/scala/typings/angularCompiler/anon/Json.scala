package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Json extends StObject {
  
  var exportAs: js.Array[ExportAs]
  
  var json: String
}
object Json {
  
  inline def apply(exportAs: js.Array[ExportAs], json: String): Json = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
  
  extension [Self <: Json](x: Self) {
    
    inline def setExportAs(value: js.Array[ExportAs]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsVarargs(value: ExportAs*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
    
    inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
  }
}
