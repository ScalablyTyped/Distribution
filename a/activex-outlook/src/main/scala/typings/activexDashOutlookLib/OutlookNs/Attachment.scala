package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Attachment")
@js.native
class Attachment protected () extends js.Object {
  val Application: Application = js.native
  val BlockLevel: OlAttachmentBlockLevel = js.native
  val Class: OlObjectClass = js.native
  var DisplayName: java.lang.String = js.native
  val FileName: java.lang.String = js.native
  val Index: scala.Double = js.native
  val MAPIOBJECT: js.Any = js.native
  var `Outlook.Attachment_typekey`: Attachment = js.native
  val Parent: js.Any = js.native
  val PathName: java.lang.String = js.native
  var Position: scala.Double = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  val Type: OlAttachmentType = js.native
  def Delete(): scala.Unit = js.native
  def GetTemporaryFilePath(): java.lang.String = js.native
  def SaveAsFile(Path: java.lang.String): scala.Unit = js.native
}

