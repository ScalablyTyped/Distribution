package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationHeader extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ConversationID: String = js.native
  
  val ConversationTopic: String = js.native
  
  def GetConversation(): Conversation = js.native
  
  def GetItems(): SimpleItems = js.native
  
  @JSName("Outlook.ConversationHeader_typekey")
  var OutlookDotConversationHeader_typekey: ConversationHeader = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object ConversationHeader {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConversationID: String,
    ConversationTopic: String,
    GetConversation: () => Conversation,
    GetItems: () => SimpleItems,
    OutlookDotConversationHeader_typekey: ConversationHeader,
    Parent: js.Any,
    Session: NameSpace
  ): ConversationHeader = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConversationID = ConversationID.asInstanceOf[js.Any], ConversationTopic = ConversationTopic.asInstanceOf[js.Any], GetConversation = js.Any.fromFunction0(GetConversation), GetItems = js.Any.fromFunction0(GetItems), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ConversationHeader_typekey")(OutlookDotConversationHeader_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationHeader]
  }
  
  @scala.inline
  implicit class ConversationHeaderMutableBuilder[Self <: ConversationHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationID(value: String): Self = StObject.set(x, "ConversationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationTopic(value: String): Self = StObject.set(x, "ConversationTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConversation(value: () => Conversation): Self = StObject.set(x, "GetConversation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItems(value: () => SimpleItems): Self = StObject.set(x, "GetItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutlookDotConversationHeader_typekey(value: ConversationHeader): Self = StObject.set(x, "Outlook.ConversationHeader_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
