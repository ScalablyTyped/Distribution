package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIn extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Author: String = js.native
  
  val CLSID: String = js.native
  
  val Comments: String = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.AddIn_typekey")
  var ExcelDotAddIn_typekey: AddIn = js.native
  
  val FullName: String = js.native
  
  var Installed: Boolean = js.native
  
  val IsOpen: Boolean = js.native
  
  val Keywords: String = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  val Subject: String = js.native
  
  val Title: String = js.native
  
  val progID: String = js.native
}
object AddIn {
  
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    CLSID: String,
    Comments: String,
    Creator: XlCreator,
    ExcelDotAddIn_typekey: AddIn,
    FullName: String,
    Installed: Boolean,
    IsOpen: Boolean,
    Keywords: String,
    Name: String,
    Parent: js.Any,
    Path: String,
    Subject: String,
    Title: String,
    progID: String
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CLSID = CLSID.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], IsOpen = IsOpen.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], progID = progID.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AddIn_typekey")(ExcelDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  
  @scala.inline
  implicit class AddInMutableBuilder[Self <: AddIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLSID(value: String): Self = StObject.set(x, "CLSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotAddIn_typekey(value: AddIn): Self = StObject.set(x, "Excel.AddIn_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled(value: Boolean): Self = StObject.set(x, "Installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "IsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgID(value: String): Self = StObject.set(x, "progID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
