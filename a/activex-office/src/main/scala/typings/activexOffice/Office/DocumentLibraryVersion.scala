package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLibraryVersion extends js.Object {
  
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
  implicit class DocumentLibraryVersionOps[Self <: DocumentLibraryVersion] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = this.set("Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: VarDate): Self = this.set("Modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("ModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotDocumentLibraryVersion_typekey(value: DocumentLibraryVersion): Self = this.set("Office.DocumentLibraryVersion_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => js.Any): Self = this.set("Open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestore(value: () => js.Any): Self = this.set("Restore", js.Any.fromFunction0(value))
  }
}
