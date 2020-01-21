package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Action")
@js.native
class Action protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var CopyLike: OlActionCopyLike = js.native
  var Enabled: Boolean = js.native
  var MessageClass: String = js.native
  var Name: String = js.native
  @JSName("Outlook.Action_typekey")
  var OutlookDotAction_typekey: Action = js.native
  val Parent: js.Any = js.native
  var Prefix: String = js.native
  var ReplyStyle: OlActionReplyStyle = js.native
  var ResponseStyle: OlActionResponseStyle = js.native
  val Session: NameSpace = js.native
  var ShowOn: OlActionShowOn = js.native
  def Delete(): Unit = js.native
  def Execute(): js.Any = js.native
}

