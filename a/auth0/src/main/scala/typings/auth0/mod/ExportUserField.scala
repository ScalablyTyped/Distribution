package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportUserField extends StObject {
  
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
  implicit class ExportUserFieldMutableBuilder[Self <: ExportUserField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExport_as(value: String): Self = StObject.set(x, "export_as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExport_asUndefined: Self = StObject.set(x, "export_as", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
