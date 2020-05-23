package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val BlockLevel: OlAttachmentBlockLevel
  val Class: OlObjectClass
  var DisplayName: String
  val FileName: String
  val Index: Double
  val MAPIOBJECT: js.Any
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: Attachment
  val Parent: js.Any
  val PathName: String
  var Position: Double
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  val Session: NameSpace
  val Size: Double
  val Type: OlAttachmentType
  def Delete(): Unit
  def GetTemporaryFilePath(): String
  def SaveAsFile(Path: String): Unit
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
}

