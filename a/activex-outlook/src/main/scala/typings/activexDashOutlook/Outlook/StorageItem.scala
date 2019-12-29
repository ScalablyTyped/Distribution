package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.StorageItem")
@js.native
class StorageItem protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Attachments: typings.activexDashOutlook.Outlook.Attachments = js.native
  var Body: String = js.native
  val Class: OlObjectClass = js.native
  val CreationTime: VarDate = js.native
  var Creator: String = js.native
  val EntryID: String = js.native
  val LastModificationTime: VarDate = js.native
  @JSName("Outlook.StorageItem_typekey")
  var OutlookDotStorageItem_typekey: StorageItem = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexDashOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Subject: String = js.native
  val UserProperties: typings.activexDashOutlook.Outlook.UserProperties = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
}

