package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Conversation")
@js.native
class Conversation protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val ConversationID: java.lang.String = js.native
  var `Outlook.Conversation_typekey`: Conversation = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def ClearAlwaysAssignCategories(Store: Store): scala.Unit = js.native
  def GetAlwaysAssignCategories(Store: Store): java.lang.String = js.native
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation = js.native
  def GetAlwaysMoveToFolder(Store: Store): Folder = js.native
  def GetChildren(Item: js.Any): SimpleItems = js.native
  def GetParent(Item: js.Any): js.Any = js.native
  def GetRootItems(): SimpleItems = js.native
  def GetTable(): Table = js.native
  def MarkAsRead(): scala.Unit = js.native
  def MarkAsUnread(): scala.Unit = js.native
  def SetAlwaysAssignCategories(Categories: java.lang.String, Store: Store): scala.Unit = js.native
  def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: Store): scala.Unit = js.native
  def SetAlwaysMoveToFolder(MoveToFolder: Folder, Store: Store): scala.Unit = js.native
  def StopAlwaysDelete(Store: Store): scala.Unit = js.native
  def StopAlwaysMoveToFolder(Store: Store): scala.Unit = js.native
}

