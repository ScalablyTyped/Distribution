package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Action")
@js.native
class Action protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  var CopyLike: OlActionCopyLike = js.native
  var Enabled: scala.Boolean = js.native
  var MessageClass: java.lang.String = js.native
  var Name: java.lang.String = js.native
  var `Outlook.Action_typekey`: Action = js.native
  val Parent: js.Any = js.native
  var Prefix: java.lang.String = js.native
  var ReplyStyle: OlActionReplyStyle = js.native
  var ResponseStyle: OlActionResponseStyle = js.native
  val Session: NameSpace = js.native
  var ShowOn: OlActionShowOn = js.native
  def Delete(): scala.Unit = js.native
  def Execute(): js.Any = js.native
}

