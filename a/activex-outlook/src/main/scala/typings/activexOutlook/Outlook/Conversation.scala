package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Conversation")
@js.native
class Conversation protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConversationID: String = js.native
  @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: Conversation = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def ClearAlwaysAssignCategories(Store: Store): Unit = js.native
  def GetAlwaysAssignCategories(Store: Store): String = js.native
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation = js.native
  def GetAlwaysMoveToFolder(Store: Store): Folder = js.native
  def GetChildren(Item: js.Any): SimpleItems = js.native
  def GetParent(Item: js.Any): js.Any = js.native
  def GetRootItems(): SimpleItems = js.native
  def GetTable(): Table = js.native
  def MarkAsRead(): Unit = js.native
  def MarkAsUnread(): Unit = js.native
  def SetAlwaysAssignCategories(Categories: String, Store: Store): Unit = js.native
  def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: Store): Unit = js.native
  def SetAlwaysMoveToFolder(MoveToFolder: Folder, Store: Store): Unit = js.native
  def StopAlwaysDelete(Store: Store): Unit = js.native
  def StopAlwaysMoveToFolder(Store: Store): Unit = js.native
}

