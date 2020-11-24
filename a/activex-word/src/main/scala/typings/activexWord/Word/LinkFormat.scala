package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFormat extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoUpdate: Boolean = js.native
  
  def BreakLink(): Unit = js.native
  
  val Creator: Double = js.native
  
  var Locked: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var SavePictureWithDocument: Boolean = js.native
  
  var SourceFullName: String = js.native
  
  val SourceName: String = js.native
  
  val SourcePath: String = js.native
  
  val Type: WdLinkType = js.native
  
  def Update(): Unit = js.native
  
  @JSName("Word.LinkFormat_typekey")
  var WordDotLinkFormat_typekey: LinkFormat = js.native
}
object LinkFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    BreakLink: () => Unit,
    Creator: Double,
    Locked: Boolean,
    Parent: js.Any,
    SavePictureWithDocument: Boolean,
    SourceFullName: String,
    SourceName: String,
    SourcePath: String,
    Type: WdLinkType,
    Update: () => Unit,
    WordDotLinkFormat_typekey: LinkFormat
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SavePictureWithDocument = SavePictureWithDocument.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourcePath = SourcePath.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.LinkFormat_typekey")(WordDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  @scala.inline
  implicit class LinkFormatOps[Self <: LinkFormat] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdate(value: Boolean): Self = this.set("AutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakLink(value: () => Unit): Self = this.set("BreakLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavePictureWithDocument(value: Boolean): Self = this.set("SavePictureWithDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFullName(value: String): Self = this.set("SourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("SourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePath(value: String): Self = this.set("SourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdLinkType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("Update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotLinkFormat_typekey(value: LinkFormat): Self = this.set("Word.LinkFormat_typekey", value.asInstanceOf[js.Any])
  }
}
