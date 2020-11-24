package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageItem extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  
  var Body: String = js.native
  
  val Class: OlObjectClass = js.native
  
  val CreationTime: VarDate = js.native
  
  var Creator: String = js.native
  
  def Delete(): Unit = js.native
  
  val EntryID: String = js.native
  
  val LastModificationTime: VarDate = js.native
  
  @JSName("Outlook.StorageItem_typekey")
  var OutlookDotStorageItem_typekey: StorageItem = js.native
  
  val Parent: js.Any = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  def Save(): Unit = js.native
  
  val Session: NameSpace = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
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
  
  @scala.inline
  implicit class StorageItemOps[Self <: StorageItem] (val x: Self) extends AnyVal {
    
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
    def setAttachments(value: Attachments): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: VarDate): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: String): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntryID(value: String): Self = this.set("EntryID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTime(value: VarDate): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotStorageItem_typekey(value: StorageItem): Self = this.set("Outlook.StorageItem_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAccessor(value: PropertyAccessor): Self = this.set("PropertyAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProperties(value: UserProperties): Self = this.set("UserProperties", value.asInstanceOf[js.Any])
  }
}
