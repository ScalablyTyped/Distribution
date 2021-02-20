package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceFile extends StObject {
  
  val Application: js.Any = js.native
  
  val CreatedBy: String = js.native
  
  val CreatedDate: VarDate = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val ModifiedBy: String = js.native
  
  val ModifiedDate: VarDate = js.native
  
  @JSName("Office.SharedWorkspaceFile_typekey")
  var OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile = js.native
  
  val Parent: js.Any = js.native
  
  val URL: String = js.native
}
object SharedWorkspaceFile {
  
  @scala.inline
  def apply(
    Application: js.Any,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile,
    Parent: js.Any,
    URL: String
  ): SharedWorkspaceFile = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceFile_typekey")(OfficeDotSharedWorkspaceFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceFile]
  }
  
  @scala.inline
  implicit class SharedWorkspaceFileMutableBuilder[Self <: SharedWorkspaceFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: VarDate): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: VarDate): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSharedWorkspaceFile_typekey(value: SharedWorkspaceFile): Self = StObject.set(x, "Office.SharedWorkspaceFile_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
