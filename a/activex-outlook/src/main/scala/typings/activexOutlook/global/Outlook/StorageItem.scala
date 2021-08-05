package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.StorageItem")
@js.native
/* private */ class StorageItem ()
  extends StObject
     with typings.activexOutlook.Outlook.StorageItem {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  
  /* CompleteClass */
  var Body: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val CreationTime: VarDate = js.native
  
  /* CompleteClass */
  var Creator: String = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val EntryID: String = js.native
  
  /* CompleteClass */
  override val LastModificationTime: VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.StorageItem_typekey")
  var OutlookDotStorageItem_typekey: typings.activexOutlook.Outlook.StorageItem = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Size: Double = js.native
  
  /* CompleteClass */
  var Subject: String = js.native
  
  /* CompleteClass */
  override val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
}
