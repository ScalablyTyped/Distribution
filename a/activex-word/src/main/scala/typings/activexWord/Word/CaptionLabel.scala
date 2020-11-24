package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionLabel extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val BuiltIn: Boolean = js.native
  
  var ChapterStyleLevel: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val ID: WdCaptionLabelID = js.native
  
  var IncludeChapterNumber: Boolean = js.native
  
  val Name: String = js.native
  
  var NumberStyle: WdCaptionNumberStyle = js.native
  
  val Parent: js.Any = js.native
  
  var Position: WdCaptionPosition = js.native
  
  var Separator: WdSeparatorType = js.native
  
  @JSName("Word.CaptionLabel_typekey")
  var WordDotCaptionLabel_typekey: CaptionLabel = js.native
}
object CaptionLabel {
  
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    ChapterStyleLevel: Double,
    Creator: Double,
    Delete: () => Unit,
    ID: WdCaptionLabelID,
    IncludeChapterNumber: Boolean,
    Name: String,
    NumberStyle: WdCaptionNumberStyle,
    Parent: js.Any,
    Position: WdCaptionPosition,
    Separator: WdSeparatorType,
    WordDotCaptionLabel_typekey: CaptionLabel
  ): CaptionLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], ChapterStyleLevel = ChapterStyleLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ID = ID.asInstanceOf[js.Any], IncludeChapterNumber = IncludeChapterNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabel_typekey")(WordDotCaptionLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabel]
  }
  
  @scala.inline
  implicit class CaptionLabelOps[Self <: CaptionLabel] (val x: Self) extends AnyVal {
    
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
    def setBuiltIn(value: Boolean): Self = this.set("BuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapterStyleLevel(value: Double): Self = this.set("ChapterStyleLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: WdCaptionLabelID): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeChapterNumber(value: Boolean): Self = this.set("IncludeChapterNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyle(value: WdCaptionNumberStyle): Self = this.set("NumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: WdCaptionPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: WdSeparatorType): Self = this.set("Separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCaptionLabel_typekey(value: CaptionLabel): Self = this.set("Word.CaptionLabel_typekey", value.asInstanceOf[js.Any])
  }
}
