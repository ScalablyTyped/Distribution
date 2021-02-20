package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  def DeleteAll(): Unit = js.native
  
  val ID: String = js.native
  
  val Name: String = js.native
  
  val NextRange: typings.activexWord.Word.Range = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def SelectAll(): Unit = js.native
  
  @JSName("Word.Editor_typekey")
  var WordDotEditor_typekey: Editor = js.native
}
object Editor {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DeleteAll: () => Unit,
    ID: String,
    Name: String,
    NextRange: Range,
    Parent: js.Any,
    Range: Range,
    SelectAll: () => Unit,
    WordDotEditor_typekey: Editor
  ): Editor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DeleteAll = js.Any.fromFunction0(DeleteAll), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NextRange = NextRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.Editor_typekey")(WordDotEditor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  @scala.inline
  implicit class EditorMutableBuilder[Self <: Editor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteAll(value: () => Unit): Self = StObject.set(x, "DeleteAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRange(value: Range): Self = StObject.set(x, "NextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAll(value: () => Unit): Self = StObject.set(x, "SelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotEditor_typekey(value: Editor): Self = StObject.set(x, "Word.Editor_typekey", value.asInstanceOf[js.Any])
  }
}
