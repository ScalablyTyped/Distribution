package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val BlockLevel: OlAttachmentBlockLevel
  
  val Class: OlObjectClass
  
  def Delete(): Unit
  
  var DisplayName: String
  
  val FileName: String
  
  def GetTemporaryFilePath(): String
  
  val Index: Double
  
  val MAPIOBJECT: js.Any
  
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: Attachment
  
  val Parent: js.Any
  
  val PathName: String
  
  var Position: Double
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  
  def SaveAsFile(Path: String): Unit
  
  val Session: NameSpace
  
  val Size: Double
  
  val Type: OlAttachmentType
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
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockLevel(value: OlAttachmentBlockLevel): Self = StObject.set(x, "BlockLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTemporaryFilePath(value: () => String): Self = StObject.set(x, "GetTemporaryFilePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAPIOBJECT(value: js.Any): Self = StObject.set(x, "MAPIOBJECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAttachment_typekey(value: Attachment): Self = StObject.set(x, "Outlook.Attachment_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathName(value: String): Self = StObject.set(x, "PathName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAccessor(value: PropertyAccessor): Self = StObject.set(x, "PropertyAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsFile(value: String => Unit): Self = StObject.set(x, "SaveAsFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OlAttachmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
