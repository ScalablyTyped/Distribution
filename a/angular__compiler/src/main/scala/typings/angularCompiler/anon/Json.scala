package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Json extends js.Object {
  
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
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportAsVarargs(value: ExportAs*): Self = this.set("exportAs", js.Array(value :_*))
    
    @scala.inline
    def setExportAs(value: js.Array[ExportAs]): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
  }
}
