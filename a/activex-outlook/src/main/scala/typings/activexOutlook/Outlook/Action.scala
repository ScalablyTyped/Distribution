package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
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
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def setCopyLike(value: OlActionCopyLike): Self = this.set("CopyLike", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: () => js.Any): Self = this.set("Execute", js.Any.fromFunction0(value))
    @scala.inline
    def setMessageClass(value: String): Self = this.set("MessageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAction_typekey(value: Action): Self = this.set("Outlook.Action_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyStyle(value: OlActionReplyStyle): Self = this.set("ReplyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseStyle(value: OlActionResponseStyle): Self = this.set("ResponseStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowOn(value: OlActionShowOn): Self = this.set("ShowOn", value.asInstanceOf[js.Any])
  }
  
}

