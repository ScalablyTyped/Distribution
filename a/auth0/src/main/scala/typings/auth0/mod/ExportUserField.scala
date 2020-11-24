package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportUserField extends js.Object {
  
  var export_as: js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object ExportUserField {
  
  @scala.inline
  def apply(name: String): ExportUserField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUserField]
  }
  
  @scala.inline
  implicit class ExportUserFieldOps[Self <: ExportUserField] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExport_as(value: String): Self = this.set("export_as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport_as: Self = this.set("export_as", js.undefined)
  }
}
