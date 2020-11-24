package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextRetrievalMode extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Duplicate: TextRetrievalMode = js.native
  
  var IncludeFieldCodes: Boolean = js.native
  
  var IncludeHiddenText: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var ViewType: WdViewType = js.native
  
  @JSName("Word.TextRetrievalMode_typekey")
  var WordDotTextRetrievalMode_typekey: TextRetrievalMode = js.native
}
object TextRetrievalMode {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Duplicate: TextRetrievalMode,
    IncludeFieldCodes: Boolean,
    IncludeHiddenText: Boolean,
    Parent: js.Any,
    ViewType: WdViewType,
    WordDotTextRetrievalMode_typekey: TextRetrievalMode
  ): TextRetrievalMode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], IncludeFieldCodes = IncludeFieldCodes.asInstanceOf[js.Any], IncludeHiddenText = IncludeHiddenText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextRetrievalMode_typekey")(WordDotTextRetrievalMode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRetrievalMode]
  }
  
  @scala.inline
  implicit class TextRetrievalModeOps[Self <: TextRetrievalMode] (val x: Self) extends AnyVal {
    
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
    def setDuplicate(value: TextRetrievalMode): Self = this.set("Duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFieldCodes(value: Boolean): Self = this.set("IncludeFieldCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHiddenText(value: Boolean): Self = this.set("IncludeHiddenText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: WdViewType): Self = this.set("ViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTextRetrievalMode_typekey(value: TextRetrievalMode): Self = this.set("Word.TextRetrievalMode_typekey", value.asInstanceOf[js.Any])
  }
}
