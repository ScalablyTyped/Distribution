package typings.activexWord.Word

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Comment: String
  
  val Creator: Double
  
  val Date: VarDate
  
  def Delete(): Unit
  
  val Index: Double
  
  def Open(): Document
  
  def OpenOld(): Unit
  
  val Parent: Any
  
  val SavedBy: String
  
  /* private */ @JSName("Word.Version_typekey")
  var WordDotVersion_typekey: Version
}
object Version {
  
  inline def apply(
    Application: Application,
    Comment: String,
    Creator: Double,
    Date: VarDate,
    Delete: () => Unit,
    Index: Double,
    Open: () => Document,
    OpenOld: () => Unit,
    Parent: Any,
    SavedBy: String,
    WordDotVersion_typekey: Version
  ): Version = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), OpenOld = js.Any.fromFunction0(OpenOld), Parent = Parent.asInstanceOf[js.Any], SavedBy = SavedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Version_typekey")(WordDotVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Document): Self = StObject.set(x, "Open", js.Any.fromFunction0(value))
    
    inline def setOpenOld(value: () => Unit): Self = StObject.set(x, "OpenOld", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSavedBy(value: String): Self = StObject.set(x, "SavedBy", value.asInstanceOf[js.Any])
    
    inline def setWordDotVersion_typekey(value: Version): Self = StObject.set(x, "Word.Version_typekey", value.asInstanceOf[js.Any])
  }
}
