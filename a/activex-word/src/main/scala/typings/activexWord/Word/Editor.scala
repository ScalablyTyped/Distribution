package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends js.Object {
  
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
  implicit class EditorOps[Self <: Editor] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteAll(value: () => Unit): Self = this.set("DeleteAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRange(value: Range): Self = this.set("NextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAll(value: () => Unit): Self = this.set("SelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotEditor_typekey(value: Editor): Self = this.set("Word.Editor_typekey", value.asInstanceOf[js.Any])
  }
}
