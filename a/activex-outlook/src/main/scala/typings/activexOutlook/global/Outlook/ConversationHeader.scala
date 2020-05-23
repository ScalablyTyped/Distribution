package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ConversationHeader")
@js.native
class ConversationHeader protected ()
  extends typings.activexOutlook.Outlook.ConversationHeader {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConversationID: String = js.native
  /* CompleteClass */
  override val ConversationTopic: String = js.native
  /* CompleteClass */
  @JSName("Outlook.ConversationHeader_typekey")
  override var OutlookDotConversationHeader_typekey: typings.activexOutlook.Outlook.ConversationHeader = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetConversation(): typings.activexOutlook.Outlook.Conversation = js.native
  /* CompleteClass */
  override def GetItems(): typings.activexOutlook.Outlook.SimpleItems = js.native
}

