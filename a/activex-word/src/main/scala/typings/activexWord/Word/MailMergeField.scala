package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeField extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Code: Range = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  var Locked: Boolean = js.native
  
  val Next: MailMergeField = js.native
  
  val Parent: js.Any = js.native
  
  val Previous: MailMergeField = js.native
  
  def Select(): Unit = js.native
  
  val Type: WdFieldType = js.native
  
  @JSName("Word.MailMergeField_typekey")
  var WordDotMailMergeField_typekey: MailMergeField = js.native
}
object MailMergeField {
  
  @scala.inline
  def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Locked: Boolean,
    Next: MailMergeField,
    Parent: js.Any,
    Previous: MailMergeField,
    Select: () => Unit,
    Type: WdFieldType,
    WordDotMailMergeField_typekey: MailMergeField
  ): MailMergeField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeField_typekey")(WordDotMailMergeField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeField]
  }
  
  @scala.inline
  implicit class MailMergeFieldOps[Self <: MailMergeField] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Range): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: MailMergeField): Self = this.set("Next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: MailMergeField): Self = this.set("Previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: WdFieldType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotMailMergeField_typekey(value: MailMergeField): Self = this.set("Word.MailMergeField_typekey", value.asInstanceOf[js.Any])
  }
}
