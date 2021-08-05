package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportUserField extends StObject {
  
  var export_as: js.UndefOr[String] = js.undefined
  
  var name: String
}
object ExportUserField {
  
  inline def apply(name: String): ExportUserField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUserField]
  }
  
  extension [Self <: ExportUserField](x: Self) {
    
    inline def setExport_as(value: String): Self = StObject.set(x, "export_as", value.asInstanceOf[js.Any])
    
    inline def setExport_asUndefined: Self = StObject.set(x, "export_as", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
