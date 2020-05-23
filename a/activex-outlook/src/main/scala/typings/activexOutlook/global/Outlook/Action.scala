package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlActionCopyLike
import typings.activexOutlook.Outlook.OlActionReplyStyle
import typings.activexOutlook.Outlook.OlActionResponseStyle
import typings.activexOutlook.Outlook.OlActionShowOn
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Action")
@js.native
class Action protected ()
  extends typings.activexOutlook.Outlook.Action {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var CopyLike: OlActionCopyLike = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var MessageClass: String = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.Action_typekey")
  override var OutlookDotAction_typekey: typings.activexOutlook.Outlook.Action = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Prefix: String = js.native
  /* CompleteClass */
  override var ReplyStyle: OlActionReplyStyle = js.native
  /* CompleteClass */
  override var ResponseStyle: OlActionResponseStyle = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowOn: OlActionShowOn = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Execute(): js.Any = js.native
}

