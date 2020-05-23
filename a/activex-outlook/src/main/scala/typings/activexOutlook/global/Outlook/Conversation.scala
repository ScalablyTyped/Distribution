package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAlwaysDeleteConversation
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Conversation")
@js.native
class Conversation protected ()
  extends typings.activexOutlook.Outlook.Conversation {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConversationID: String = js.native
  /* CompleteClass */
  @JSName("Outlook.Conversation_typekey")
  override var OutlookDotConversation_typekey: typings.activexOutlook.Outlook.Conversation = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def ClearAlwaysAssignCategories(Store: typings.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def GetAlwaysAssignCategories(Store: typings.activexOutlook.Outlook.Store): String = js.native
  /* CompleteClass */
  override def GetAlwaysDelete(Store: typings.activexOutlook.Outlook.Store): OlAlwaysDeleteConversation = js.native
  /* CompleteClass */
  override def GetAlwaysMoveToFolder(Store: typings.activexOutlook.Outlook.Store): typings.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override def GetChildren(Item: js.Any): typings.activexOutlook.Outlook.SimpleItems = js.native
  /* CompleteClass */
  override def GetParent(Item: js.Any): js.Any = js.native
  /* CompleteClass */
  override def GetRootItems(): typings.activexOutlook.Outlook.SimpleItems = js.native
  /* CompleteClass */
  override def GetTable(): typings.activexOutlook.Outlook.Table = js.native
  /* CompleteClass */
  override def MarkAsRead(): Unit = js.native
  /* CompleteClass */
  override def MarkAsUnread(): Unit = js.native
  /* CompleteClass */
  override def SetAlwaysAssignCategories(Categories: String, Store: typings.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: typings.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def SetAlwaysMoveToFolder(MoveToFolder: typings.activexOutlook.Outlook.Folder, Store: typings.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def StopAlwaysDelete(Store: typings.activexOutlook.Outlook.Store): Unit = js.native
  /* CompleteClass */
  override def StopAlwaysMoveToFolder(Store: typings.activexOutlook.Outlook.Store): Unit = js.native
}

