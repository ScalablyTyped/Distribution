package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversation extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConversationID: String
  @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: Conversation
  val Parent: js.Any
  val Session: NameSpace
  def ClearAlwaysAssignCategories(Store: Store): Unit
  def GetAlwaysAssignCategories(Store: Store): String
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation
  def GetAlwaysMoveToFolder(Store: Store): Folder
  def GetChildren(Item: js.Any): SimpleItems
  def GetParent(Item: js.Any): js.Any
  def GetRootItems(): SimpleItems
  def GetTable(): Table
  def MarkAsRead(): Unit
  def MarkAsUnread(): Unit
  def SetAlwaysAssignCategories(Categories: String, Store: Store): Unit
  def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: Store): Unit
  def SetAlwaysMoveToFolder(MoveToFolder: Folder, Store: Store): Unit
  def StopAlwaysDelete(Store: Store): Unit
  def StopAlwaysMoveToFolder(Store: Store): Unit
}

object Conversation {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ClearAlwaysAssignCategories: Store => Unit,
    ConversationID: String,
    GetAlwaysAssignCategories: Store => String,
    GetAlwaysDelete: Store => OlAlwaysDeleteConversation,
    GetAlwaysMoveToFolder: Store => Folder,
    GetChildren: js.Any => SimpleItems,
    GetParent: js.Any => js.Any,
    GetRootItems: () => SimpleItems,
    GetTable: () => Table,
    MarkAsRead: () => Unit,
    MarkAsUnread: () => Unit,
    OutlookDotConversation_typekey: Conversation,
    Parent: js.Any,
    Session: NameSpace,
    SetAlwaysAssignCategories: (String, Store) => Unit,
    SetAlwaysDelete: (OlAlwaysDeleteConversation, Store) => Unit,
    SetAlwaysMoveToFolder: (Folder, Store) => Unit,
    StopAlwaysDelete: Store => Unit,
    StopAlwaysMoveToFolder: Store => Unit
  ): Conversation = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ClearAlwaysAssignCategories = js.Any.fromFunction1(ClearAlwaysAssignCategories), ConversationID = ConversationID.asInstanceOf[js.Any], GetAlwaysAssignCategories = js.Any.fromFunction1(GetAlwaysAssignCategories), GetAlwaysDelete = js.Any.fromFunction1(GetAlwaysDelete), GetAlwaysMoveToFolder = js.Any.fromFunction1(GetAlwaysMoveToFolder), GetChildren = js.Any.fromFunction1(GetChildren), GetParent = js.Any.fromFunction1(GetParent), GetRootItems = js.Any.fromFunction0(GetRootItems), GetTable = js.Any.fromFunction0(GetTable), MarkAsRead = js.Any.fromFunction0(MarkAsRead), MarkAsUnread = js.Any.fromFunction0(MarkAsUnread), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetAlwaysAssignCategories = js.Any.fromFunction2(SetAlwaysAssignCategories), SetAlwaysDelete = js.Any.fromFunction2(SetAlwaysDelete), SetAlwaysMoveToFolder = js.Any.fromFunction2(SetAlwaysMoveToFolder), StopAlwaysDelete = js.Any.fromFunction1(StopAlwaysDelete), StopAlwaysMoveToFolder = js.Any.fromFunction1(StopAlwaysMoveToFolder))
    __obj.updateDynamic("Outlook.Conversation_typekey")(OutlookDotConversation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
}

