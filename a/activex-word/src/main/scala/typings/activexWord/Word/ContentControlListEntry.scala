package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentControlListEntry extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Index: Double = js.native
  
  def MoveDown(): Unit = js.native
  
  def MoveUp(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): Unit = js.native
  
  var Text: String = js.native
  
  var Value: String = js.native
  
  @JSName("Word.ContentControlListEntry_typekey")
  var WordDotContentControlListEntry_typekey: ContentControlListEntry = js.native
}
object ContentControlListEntry {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    MoveDown: () => Unit,
    MoveUp: () => Unit,
    Parent: js.Any,
    Select: () => Unit,
    Text: String,
    Value: String,
    WordDotContentControlListEntry_typekey: ContentControlListEntry
  ): ContentControlListEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], MoveDown = js.Any.fromFunction0(MoveDown), MoveUp = js.Any.fromFunction0(MoveUp), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Text = Text.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ContentControlListEntry_typekey")(WordDotContentControlListEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlListEntry]
  }
  
  @scala.inline
  implicit class ContentControlListEntryOps[Self <: ContentControlListEntry] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDown(value: () => Unit): Self = this.set("MoveDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveUp(value: () => Unit): Self = this.set("MoveUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotContentControlListEntry_typekey(value: ContentControlListEntry): Self = this.set("Word.ContentControlListEntry_typekey", value.asInstanceOf[js.Any])
  }
}
