package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentFile extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Index: Double = js.native
  
  val Name: String = js.native
  
  def Open(): Document = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  var ReadOnly: Boolean = js.native
  
  @JSName("Word.RecentFile_typekey")
  var WordDotRecentFile_typekey: RecentFile = js.native
}
object RecentFile {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Open: () => Document,
    Parent: js.Any,
    Path: String,
    ReadOnly: Boolean,
    WordDotRecentFile_typekey: RecentFile
  ): RecentFile = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.RecentFile_typekey")(WordDotRecentFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentFile]
  }
  
  @scala.inline
  implicit class RecentFileMutableBuilder[Self <: RecentFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Document): Self = StObject.set(x, "Open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotRecentFile_typekey(value: RecentFile): Self = StObject.set(x, "Word.RecentFile_typekey", value.asInstanceOf[js.Any])
  }
}
