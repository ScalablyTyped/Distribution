package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlookBarPane extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Contents: OutlookBarStorage
  var CurrentGroup: OutlookBarGroup
  val Name: String
  @JSName("Outlook.OutlookBarPane_typekey")
  var OutlookDotOutlookBarPane_typekey: OutlookBarPane
  val Parent: js.Any
  val Session: NameSpace
  var Visible: Boolean
}

object OutlookBarPane {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Contents: OutlookBarStorage,
    CurrentGroup: OutlookBarGroup,
    Name: String,
    OutlookDotOutlookBarPane_typekey: OutlookBarPane,
    Parent: js.Any,
    Session: NameSpace,
    Visible: Boolean
  ): OutlookBarPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Contents = Contents.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarPane_typekey")(OutlookDotOutlookBarPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarPane]
  }
}

