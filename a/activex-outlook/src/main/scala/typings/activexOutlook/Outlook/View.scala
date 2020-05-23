package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Filter: String
  var Language: String
  var LockUserChanges: Boolean
  var Name: String
  @JSName("Outlook.View_typekey")
  var OutlookDotView_typekey: View
  val Parent: js.Any
  val SaveOption: OlViewSaveOption
  val Session: NameSpace
  val Standard: Boolean
  val ViewType: OlViewType
  var XML: String
  def Apply(): Unit
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  def Delete(): Unit
  def GoToDate(Date: VarDate): Unit
  def Reset(): Unit
  def Save(): Unit
}

object View {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: () => Unit,
    Filter: String,
    GoToDate: VarDate => Unit,
    Language: String,
    LockUserChanges: Boolean,
    Name: String,
    OutlookDotView_typekey: View,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    Standard: Boolean,
    ViewType: OlViewType,
    XML: String
  ): View = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.View_typekey")(OutlookDotView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
}

