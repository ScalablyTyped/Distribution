package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLibraryVersion extends StObject {
  
  val Application: js.Any = js.native
  
  val Comments: String = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Index: Double = js.native
  
  val Modified: VarDate = js.native
  
  val ModifiedBy: String = js.native
  
  @JSName("Office.DocumentLibraryVersion_typekey")
  var OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion = js.native
  
  def Open(): js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def Restore(): js.Any = js.native
}
object DocumentLibraryVersion {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Comments: String,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Modified: VarDate,
    ModifiedBy: String,
    OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion,
    Open: () => js.Any,
    Parent: js.Any,
    Restore: () => js.Any
  ): DocumentLibraryVersion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Restore = js.Any.fromFunction0(Restore))
    __obj.updateDynamic("Office.DocumentLibraryVersion_typekey")(OfficeDotDocumentLibraryVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLibraryVersion]
  }
  
  @scala.inline
  implicit class DocumentLibraryVersionMutableBuilder[Self <: DocumentLibraryVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: VarDate): Self = StObject.set(x, "Modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotDocumentLibraryVersion_typekey(value: DocumentLibraryVersion): Self = StObject.set(x, "Office.DocumentLibraryVersion_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => js.Any): Self = StObject.set(x, "Open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestore(value: () => js.Any): Self = StObject.set(x, "Restore", js.Any.fromFunction0(value))
  }
}
