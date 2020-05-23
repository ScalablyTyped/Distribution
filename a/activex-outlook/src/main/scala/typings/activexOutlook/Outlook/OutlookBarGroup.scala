package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookBarGroup extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Name: String
  @JSName("Outlook.OutlookBarGroup_typekey")
  var OutlookDotOutlookBarGroup_typekey: OutlookBarGroup
  val Parent: js.Any
  val Session: NameSpace
  val Shortcuts: OutlookBarShortcuts
  var ViewType: OlOutlookBarViewType
}

object OutlookBarGroup {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarGroup_typekey: OutlookBarGroup,
    Parent: js.Any,
    Session: NameSpace,
    Shortcuts: OutlookBarShortcuts,
    ViewType: OlOutlookBarViewType
  ): OutlookBarGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Shortcuts = Shortcuts.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarGroup_typekey")(OutlookDotOutlookBarGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarGroup]
  }
}

