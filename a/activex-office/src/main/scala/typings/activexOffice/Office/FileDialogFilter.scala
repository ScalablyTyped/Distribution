package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDialogFilter extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val Description: String
  
  val Extensions: String
  
  @JSName("Office.FileDialogFilter_typekey")
  var OfficeDotFileDialogFilter_typekey: FileDialogFilter
  
  val Parent: js.Any
}
object FileDialogFilter {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    Extensions: String,
    OfficeDotFileDialogFilter_typekey: FileDialogFilter,
    Parent: js.Any
  ): FileDialogFilter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.FileDialogFilter_typekey")(OfficeDotFileDialogFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDialogFilter]
  }
  
  @scala.inline
  implicit class FileDialogFilterMutableBuilder[Self <: FileDialogFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: String): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotFileDialogFilter_typekey(value: FileDialogFilter): Self = StObject.set(x, "Office.FileDialogFilter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
