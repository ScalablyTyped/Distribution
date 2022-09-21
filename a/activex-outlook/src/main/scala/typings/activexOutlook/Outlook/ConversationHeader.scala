package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationHeader extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConversationID: String
  
  val ConversationTopic: String
  
  def GetConversation(): Conversation
  
  def GetItems(): SimpleItems
  
  /* private */ @JSName("Outlook.ConversationHeader_typekey")
  var OutlookDotConversationHeader_typekey: ConversationHeader
  
  val Parent: Any
  
  val Session: NameSpace
}
object ConversationHeader {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ConversationID: String,
    ConversationTopic: String,
    GetConversation: () => Conversation,
    GetItems: () => SimpleItems,
    OutlookDotConversationHeader_typekey: ConversationHeader,
    Parent: Any,
    Session: NameSpace
  ): ConversationHeader = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConversationID = ConversationID.asInstanceOf[js.Any], ConversationTopic = ConversationTopic.asInstanceOf[js.Any], GetConversation = js.Any.fromFunction0(GetConversation), GetItems = js.Any.fromFunction0(GetItems), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ConversationHeader_typekey")(OutlookDotConversationHeader_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationHeader]
  }
  
  extension [Self <: ConversationHeader](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConversationID(value: String): Self = StObject.set(x, "ConversationID", value.asInstanceOf[js.Any])
    
    inline def setConversationTopic(value: String): Self = StObject.set(x, "ConversationTopic", value.asInstanceOf[js.Any])
    
    inline def setGetConversation(value: () => Conversation): Self = StObject.set(x, "GetConversation", js.Any.fromFunction0(value))
    
    inline def setGetItems(value: () => SimpleItems): Self = StObject.set(x, "GetItems", js.Any.fromFunction0(value))
    
    inline def setOutlookDotConversationHeader_typekey(value: ConversationHeader): Self = StObject.set(x, "Outlook.ConversationHeader_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
