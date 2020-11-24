package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val BlockLevel: OlAttachmentBlockLevel = js.native
  
  val Class: OlObjectClass = js.native
  
  def Delete(): Unit = js.native
  
  var DisplayName: String = js.native
  
  val FileName: String = js.native
  
  def GetTemporaryFilePath(): String = js.native
  
  val Index: Double = js.native
  
  val MAPIOBJECT: js.Any = js.native
  
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: Attachment = js.native
  
  val Parent: js.Any = js.native
  
  val PathName: String = js.native
  
  var Position: Double = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  def SaveAsFile(Path: String): Unit = js.native
  
  val Session: NameSpace = js.native
  
  val Size: Double = js.native
  
  val Type: OlAttachmentType = js.native
}
object Attachment {
  
  @scala.inline
  def apply(
    Application: Application,
    BlockLevel: OlAttachmentBlockLevel,
    Class: OlObjectClass,
    Delete: () => Unit,
    DisplayName: String,
    FileName: String,
    GetTemporaryFilePath: () => String,
    Index: Double,
    MAPIOBJECT: js.Any,
    OutlookDotAttachment_typekey: Attachment,
    Parent: js.Any,
    PathName: String,
    Position: Double,
    PropertyAccessor: PropertyAccessor,
    SaveAsFile: String => Unit,
    Session: NameSpace,
    Size: Double,
    Type: OlAttachmentType
  ): Attachment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BlockLevel = BlockLevel.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayName = DisplayName.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], GetTemporaryFilePath = js.Any.fromFunction0(GetTemporaryFilePath), Index = Index.asInstanceOf[js.Any], MAPIOBJECT = MAPIOBJECT.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PathName = PathName.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], SaveAsFile = js.Any.fromFunction1(SaveAsFile), Session = Session.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Attachment_typekey")(OutlookDotAttachment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    
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
    def setBlockLevel(value: OlAttachmentBlockLevel): Self = this.set("BlockLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTemporaryFilePath(value: () => String): Self = this.set("GetTemporaryFilePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAPIOBJECT(value: js.Any): Self = this.set("MAPIOBJECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAttachment_typekey(value: Attachment): Self = this.set("Outlook.Attachment_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathName(value: String): Self = this.set("PathName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAccessor(value: PropertyAccessor): Self = this.set("PropertyAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsFile(value: String => Unit): Self = this.set("SaveAsFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OlAttachmentType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
