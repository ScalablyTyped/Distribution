package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentItem extends StObject {
  
  val Actions: typings.activexOutlook.Outlook.Actions = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  val Conflicts: typings.activexOutlook.Outlook.Conflicts = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): Any = js.native
  
  val CreationTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  val EntryID: String = js.native
  
  val FormDescription: typings.activexOutlook.Outlook.FormDescription = js.native
  
  val GetInspector: Inspector = js.native
  
  var Importance: OlImportance = js.native
  
  val IsConflict: Boolean = js.native
  
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val Links: typings.activexOutlook.Outlook.Links = js.native
  
  val MAPIOBJECT: Any = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  var NoAging: Boolean = js.native
  
  /* private */ @JSName("Outlook.DocumentItem_typekey")
  var OutlookDotDocumentItem_typekey: DocumentItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Session: NameSpace = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
}
