package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Json extends StObject {
  
  var exportAs: js.Array[ExportAs] = js.native
  
  var json: String = js.native
}
object Json {
  
  @scala.inline
  def apply(exportAs: js.Array[ExportAs], json: String): Json = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
  
  @scala.inline
  implicit class JsonMutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportAs(value: js.Array[ExportAs]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsVarargs(value: ExportAs*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
    
    @scala.inline
    def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
  }
}
