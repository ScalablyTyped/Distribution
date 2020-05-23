package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconView extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Filter: String
  var IconPlacement: OlIconViewPlacement
  var IconViewType: OlIconViewType
  var Language: String
  var LockUserChanges: Boolean
  var Name: String
  @JSName("Outlook.IconView_typekey")
  var OutlookDotIconView_typekey: IconView
  val Parent: js.Any
  val SaveOption: OlViewSaveOption
  val Session: NameSpace
  val SortFields: OrderFields
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

object IconView {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: () => Unit,
    Filter: String,
    GoToDate: VarDate => Unit,
    IconPlacement: OlIconViewPlacement,
    IconViewType: OlIconViewType,
    Language: String,
    LockUserChanges: Boolean,
    Name: String,
    OutlookDotIconView_typekey: IconView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewType: OlViewType,
    XML: String
  ): IconView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), IconPlacement = IconPlacement.asInstanceOf[js.Any], IconViewType = IconViewType.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.IconView_typekey")(OutlookDotIconView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconView]
  }
}

