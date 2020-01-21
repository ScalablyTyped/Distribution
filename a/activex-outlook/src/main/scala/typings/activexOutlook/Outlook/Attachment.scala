package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Attachment")
@js.native
class Attachment protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val BlockLevel: OlAttachmentBlockLevel = js.native
  val Class: OlObjectClass = js.native
  var DisplayName: String = js.native
  val FileName: String = js.native
  val Index: Double = js.native
  val MAPIOBJECT: js.Any = js.native
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: Attachment = js.native
  val Parent: js.Any = js.native
  val PathName: String = js.native
  var Position: Double = js.native
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  val Type: OlAttachmentType = js.native
  def Delete(): Unit = js.native
  def GetTemporaryFilePath(): String = js.native
  def SaveAsFile(Path: String): Unit = js.native
}

