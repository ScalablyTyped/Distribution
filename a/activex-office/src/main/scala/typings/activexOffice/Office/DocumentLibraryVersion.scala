package typings.activexOffice.Office

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLibraryVersion extends StObject {
  
  val Application: Any
  
  val Comments: String
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  val Modified: VarDate
  
  val ModifiedBy: String
  
  /* private */ @JSName("Office.DocumentLibraryVersion_typekey")
  var OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion
  
  def Open(): Any
  
  val Parent: Any
  
  def Restore(): Any
}
object DocumentLibraryVersion {
  
  inline def apply(
    Application: Any,
    Comments: String,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Modified: VarDate,
    ModifiedBy: String,
    OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion,
    Open: () => Any,
    Parent: Any,
    Restore: () => Any
  ): DocumentLibraryVersion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Restore = js.Any.fromFunction0(Restore))
    __obj.updateDynamic("Office.DocumentLibraryVersion_typekey")(OfficeDotDocumentLibraryVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLibraryVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLibraryVersion] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setModified(value: VarDate): Self = StObject.set(x, "Modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotDocumentLibraryVersion_typekey(value: DocumentLibraryVersion): Self = StObject.set(x, "Office.DocumentLibraryVersion_typekey", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Any): Self = StObject.set(x, "Open", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRestore(value: () => Any): Self = StObject.set(x, "Restore", js.Any.fromFunction0(value))
  }
}
