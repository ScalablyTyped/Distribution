package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookBarShortcut extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Name: String
  @JSName("Outlook.OutlookBarShortcut_typekey")
  var OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut
  val Parent: js.Any
  val Session: NameSpace
  val Target: js.Any
  def SetIcon(Icon: js.Any): Unit
}

object OutlookBarShortcut {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut,
    Parent: js.Any,
    Session: NameSpace,
    SetIcon: js.Any => Unit,
    Target: js.Any
  ): OutlookBarShortcut = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetIcon = js.Any.fromFunction1(SetIcon), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarShortcut_typekey")(OutlookDotOutlookBarShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarShortcut]
  }
}

