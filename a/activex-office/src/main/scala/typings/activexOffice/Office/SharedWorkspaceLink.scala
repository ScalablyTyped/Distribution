package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceLink extends StObject {
  
  val Application: js.Any = js.native
  
  val CreatedBy: String = js.native
  
  val CreatedDate: VarDate = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Description: String = js.native
  
  val ModifiedBy: String = js.native
  
  val ModifiedDate: VarDate = js.native
  
  var Notes: String = js.native
  
  @JSName("Office.SharedWorkspaceLink_typekey")
  var OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink = js.native
  
  val Parent: js.Any = js.native
  
  def Save(): Unit = js.native
  
  var URL: String = js.native
}
object SharedWorkspaceLink {
  
  @scala.inline
  def apply(
    Application: js.Any,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    Description: String,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    Notes: String,
    OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink,
    Parent: js.Any,
    Save: () => Unit,
    URL: String
  ): SharedWorkspaceLink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Notes = Notes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), URL = URL.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceLink_typekey")(OfficeDotSharedWorkspaceLink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceLink]
  }
  
  @scala.inline
  implicit class SharedWorkspaceLinkMutableBuilder[Self <: SharedWorkspaceLink] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: VarDate): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSharedWorkspaceLink_typekey(value: SharedWorkspaceLink): Self = StObject.set(x, "Office.SharedWorkspaceLink_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
