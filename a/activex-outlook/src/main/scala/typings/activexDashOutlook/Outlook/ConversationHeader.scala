package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ConversationHeader")
@js.native
class ConversationHeader protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConversationID: String = js.native
  val ConversationTopic: String = js.native
  var `Outlook.ConversationHeader_typekey`: ConversationHeader = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetConversation(): Conversation = js.native
  def GetItems(): SimpleItems = js.native
}

