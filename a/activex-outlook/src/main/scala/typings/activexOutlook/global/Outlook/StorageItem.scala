package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.StorageItem")
@js.native
class StorageItem protected ()
  extends typings.activexOutlook.Outlook.StorageItem {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  /* CompleteClass */
  override var Body: String = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val CreationTime: VarDate = js.native
  /* CompleteClass */
  override var Creator: String = js.native
  /* CompleteClass */
  override val EntryID: String = js.native
  /* CompleteClass */
  override val LastModificationTime: VarDate = js.native
  /* CompleteClass */
  @JSName("Outlook.StorageItem_typekey")
  override var OutlookDotStorageItem_typekey: typings.activexOutlook.Outlook.StorageItem = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override val Size: Double = js.native
  /* CompleteClass */
  override var Subject: String = js.native
  /* CompleteClass */
  override val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Save(): Unit = js.native
}

