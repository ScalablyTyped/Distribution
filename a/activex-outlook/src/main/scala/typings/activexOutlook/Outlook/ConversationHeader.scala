package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationHeader extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConversationID: String = js.native
  val ConversationTopic: String = js.native
  @JSName("Outlook.ConversationHeader_typekey")
  var OutlookDotConversationHeader_typekey: ConversationHeader = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetConversation(): Conversation = js.native
  def GetItems(): SimpleItems = js.native
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
  implicit class ConversationHeaderOps[Self <: ConversationHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setConversationID(value: String): Self = this.set("ConversationID", value.asInstanceOf[js.Any])
    @scala.inline
    def setConversationTopic(value: String): Self = this.set("ConversationTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetConversation(value: () => Conversation): Self = this.set("GetConversation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItems(value: () => SimpleItems): Self = this.set("GetItems", js.Any.fromFunction0(value))
    @scala.inline
    def setOutlookDotConversationHeader_typekey(value: ConversationHeader): Self = this.set("Outlook.ConversationHeader_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

