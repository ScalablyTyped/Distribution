package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationHeader extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConversationID: String
  val ConversationTopic: String
  @JSName("Outlook.ConversationHeader_typekey")
  var OutlookDotConversationHeader_typekey: ConversationHeader
  val Parent: js.Any
  val Session: NameSpace
  def GetConversation(): Conversation
  def GetItems(): SimpleItems
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
}

