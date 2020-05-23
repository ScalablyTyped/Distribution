package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageItem extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Attachments: typings.activexOutlook.Outlook.Attachments
  var Body: String
  val Class: OlObjectClass
  val CreationTime: VarDate
  var Creator: String
  val EntryID: String
  val LastModificationTime: VarDate
  @JSName("Outlook.StorageItem_typekey")
  var OutlookDotStorageItem_typekey: StorageItem
  val Parent: js.Any
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  val Session: NameSpace
  val Size: Double
  var Subject: String
  val UserProperties: typings.activexOutlook.Outlook.UserProperties
  def Delete(): Unit
  def Save(): Unit
}

object StorageItem {
  @scala.inline
  def apply(
    Application: Application,
    Attachments: Attachments,
    Body: String,
    Class: OlObjectClass,
    CreationTime: VarDate,
    Creator: String,
    Delete: () => Unit,
    EntryID: String,
    LastModificationTime: VarDate,
    OutlookDotStorageItem_typekey: StorageItem,
    Parent: js.Any,
    PropertyAccessor: PropertyAccessor,
    Save: () => Unit,
    Session: NameSpace,
    Size: Double,
    Subject: String,
    UserProperties: UserProperties
  ): StorageItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Attachments = Attachments.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EntryID = EntryID.asInstanceOf[js.Any], LastModificationTime = LastModificationTime.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyAccessor = PropertyAccessor.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), Session = Session.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.StorageItem_typekey")(OutlookDotStorageItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageItem]
  }
}

