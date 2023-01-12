package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageItem extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Attachments: typings.activexOutlook.Outlook.Attachments
  
  var Body: String
  
  val Class: OlObjectClass
  
  val CreationTime: VarDate
  
  var Creator: String
  
  def Delete(): Unit
  
  val EntryID: String
  
  val LastModificationTime: VarDate
  
  /* private */ @JSName("Outlook.StorageItem_typekey")
  var OutlookDotStorageItem_typekey: StorageItem
  
  val Parent: Any
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor
  
  def Save(): Unit
  
  val Session: NameSpace
  
  val Size: Double
  
  var Subject: String
  
  val UserProperties: typings.activexOutlook.Outlook.UserProperties
}
object StorageItem {
  
  inline def apply(
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
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: StorageItem] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: VarDate): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setEntryID(value: String): Self = StObject.set(x, "EntryID", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTime(value: VarDate): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotStorageItem_typekey(value: StorageItem): Self = StObject.set(x, "Outlook.StorageItem_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPropertyAccessor(value: PropertyAccessor): Self = StObject.set(x, "PropertyAccessor", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "UserProperties", value.asInstanceOf[js.Any])
  }
}
