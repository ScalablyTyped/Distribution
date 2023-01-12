package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDialogFilter extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Description: String
  
  val Extensions: String
  
  /* private */ @JSName("Office.FileDialogFilter_typekey")
  var OfficeDotFileDialogFilter_typekey: FileDialogFilter
  
  val Parent: Any
}
object FileDialogFilter {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Description: String,
    Extensions: String,
    OfficeDotFileDialogFilter_typekey: FileDialogFilter,
    Parent: Any
  ): FileDialogFilter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.FileDialogFilter_typekey")(OfficeDotFileDialogFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDialogFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDialogFilter] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: String): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotFileDialogFilter_typekey(value: FileDialogFilter): Self = StObject.set(x, "Office.FileDialogFilter_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
