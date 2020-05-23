package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessCardView extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  var CardSize: Double
  val Class: OlObjectClass
  var Filter: String
  val HeadingsFont: ViewFont
  var Language: String
  var LockUserChanges: Boolean
  var Name: String
  @JSName("Outlook.BusinessCardView_typekey")
  var OutlookDotBusinessCardView_typekey: BusinessCardView
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

object BusinessCardView {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    CardSize: Double,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: () => Unit,
    Filter: String,
    GoToDate: VarDate => Unit,
    HeadingsFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    Name: String,
    OutlookDotBusinessCardView_typekey: BusinessCardView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewType: OlViewType,
    XML: String
  ): BusinessCardView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), CardSize = CardSize.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), HeadingsFont = HeadingsFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.BusinessCardView_typekey")(OutlookDotBusinessCardView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessCardView]
  }
}

