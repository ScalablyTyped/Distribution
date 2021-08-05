package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversation extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  def ClearAlwaysAssignCategories(Store: Store): Unit
  
  val ConversationID: String
  
  def GetAlwaysAssignCategories(Store: Store): String
  
  def GetAlwaysDelete(Store: Store): OlAlwaysDeleteConversation
  
  def GetAlwaysMoveToFolder(Store: Store): Folder
  
  def GetChildren(Item: js.Any): SimpleItems
  
  def GetParent(Item: js.Any): js.Any
  
  def GetRootItems(): SimpleItems
  
  def GetTable(): Table
  
  def MarkAsRead(): Unit
  
  def MarkAsUnread(): Unit
  
  /* private */ @JSName("Outlook.Conversation_typekey")
  var OutlookDotConversation_typekey: Conversation
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  def SetAlwaysAssignCategories(Categories: String, Store: Store): Unit
  
  def SetAlwaysDelete(AlwaysDelete: OlAlwaysDeleteConversation, Store: Store): Unit
  
  def SetAlwaysMoveToFolder(MoveToFolder: Folder, Store: Store): Unit
  
  def StopAlwaysDelete(Store: Store): Unit
  
  def StopAlwaysMoveToFolder(Store: Store): Unit
}
object Conversation {
  
  inline def apply(
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
  
  extension [Self <: Conversation](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setClearAlwaysAssignCategories(value: Store => Unit): Self = StObject.set(x, "ClearAlwaysAssignCategories", js.Any.fromFunction1(value))
    
    inline def setConversationID(value: String): Self = StObject.set(x, "ConversationID", value.asInstanceOf[js.Any])
    
    inline def setGetAlwaysAssignCategories(value: Store => String): Self = StObject.set(x, "GetAlwaysAssignCategories", js.Any.fromFunction1(value))
    
    inline def setGetAlwaysDelete(value: Store => OlAlwaysDeleteConversation): Self = StObject.set(x, "GetAlwaysDelete", js.Any.fromFunction1(value))
    
    inline def setGetAlwaysMoveToFolder(value: Store => Folder): Self = StObject.set(x, "GetAlwaysMoveToFolder", js.Any.fromFunction1(value))
    
    inline def setGetChildren(value: js.Any => SimpleItems): Self = StObject.set(x, "GetChildren", js.Any.fromFunction1(value))
    
    inline def setGetParent(value: js.Any => js.Any): Self = StObject.set(x, "GetParent", js.Any.fromFunction1(value))
    
    inline def setGetRootItems(value: () => SimpleItems): Self = StObject.set(x, "GetRootItems", js.Any.fromFunction0(value))
    
    inline def setGetTable(value: () => Table): Self = StObject.set(x, "GetTable", js.Any.fromFunction0(value))
    
    inline def setMarkAsRead(value: () => Unit): Self = StObject.set(x, "MarkAsRead", js.Any.fromFunction0(value))
    
    inline def setMarkAsUnread(value: () => Unit): Self = StObject.set(x, "MarkAsUnread", js.Any.fromFunction0(value))
    
    inline def setOutlookDotConversation_typekey(value: Conversation): Self = StObject.set(x, "Outlook.Conversation_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetAlwaysAssignCategories(value: (String, Store) => Unit): Self = StObject.set(x, "SetAlwaysAssignCategories", js.Any.fromFunction2(value))
    
    inline def setSetAlwaysDelete(value: (OlAlwaysDeleteConversation, Store) => Unit): Self = StObject.set(x, "SetAlwaysDelete", js.Any.fromFunction2(value))
    
    inline def setSetAlwaysMoveToFolder(value: (Folder, Store) => Unit): Self = StObject.set(x, "SetAlwaysMoveToFolder", js.Any.fromFunction2(value))
    
    inline def setStopAlwaysDelete(value: Store => Unit): Self = StObject.set(x, "StopAlwaysDelete", js.Any.fromFunction1(value))
    
    inline def setStopAlwaysMoveToFolder(value: Store => Unit): Self = StObject.set(x, "StopAlwaysMoveToFolder", js.Any.fromFunction1(value))
  }
}
