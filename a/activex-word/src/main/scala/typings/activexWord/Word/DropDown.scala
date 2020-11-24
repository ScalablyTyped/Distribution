package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDown extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var Default: Double = js.native
  
  val ListEntries: typings.activexWord.Word.ListEntries = js.native
  
  val Parent: js.Any = js.native
  
  val Valid: Boolean = js.native
  
  var Value: Double = js.native
  
  @JSName("Word.DropDown_typekey")
  var WordDotDropDown_typekey: DropDown = js.native
}
object DropDown {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Default: Double,
    ListEntries: ListEntries,
    Parent: js.Any,
    Valid: Boolean,
    Value: Double,
    WordDotDropDown_typekey: DropDown
  ): DropDown = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ListEntries = ListEntries.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.DropDown_typekey")(WordDotDropDown_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDown]
  }
  
  @scala.inline
  implicit class DropDownOps[Self <: DropDown] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: Double): Self = this.set("Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEntries(value: ListEntries): Self = this.set("ListEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDropDown_typekey(value: DropDown): Self = this.set("Word.DropDown_typekey", value.asInstanceOf[js.Any])
  }
}
