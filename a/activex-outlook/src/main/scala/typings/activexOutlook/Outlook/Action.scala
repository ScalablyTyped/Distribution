package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var CopyLike: OlActionCopyLike
  var Enabled: Boolean
  var MessageClass: String
  var Name: String
  @JSName("Outlook.Action_typekey")
  var OutlookDotAction_typekey: Action
  val Parent: js.Any
  var Prefix: String
  var ReplyStyle: OlActionReplyStyle
  var ResponseStyle: OlActionResponseStyle
  val Session: NameSpace
  var ShowOn: OlActionShowOn
  def Delete(): Unit
  def Execute(): js.Any
}

object Action {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    CopyLike: OlActionCopyLike,
    Delete: () => Unit,
    Enabled: Boolean,
    Execute: () => js.Any,
    MessageClass: String,
    Name: String,
    OutlookDotAction_typekey: Action,
    Parent: js.Any,
    Prefix: String,
    ReplyStyle: OlActionReplyStyle,
    ResponseStyle: OlActionResponseStyle,
    Session: NameSpace,
    ShowOn: OlActionShowOn
  ): Action = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CopyLike = CopyLike.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), MessageClass = MessageClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], ReplyStyle = ReplyStyle.asInstanceOf[js.Any], ResponseStyle = ResponseStyle.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowOn = ShowOn.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Action_typekey")(OutlookDotAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

