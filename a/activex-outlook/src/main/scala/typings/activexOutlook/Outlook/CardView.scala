package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardView extends js.Object {
  var AllowInCellEditing: Boolean
  val Application: typings.activexOutlook.Outlook.Application
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules
  val BodyFont: ViewFont
  val Class: OlObjectClass
  var Filter: String
  val HeadingsFont: ViewFont
  var Language: String
  var LockUserChanges: Boolean
  var MultiLineFieldHeight: Double
  var Name: String
  @JSName("Outlook.CardView_typekey")
  var OutlookDotCardView_typekey: CardView
  val Parent: js.Any
  val SaveOption: OlViewSaveOption
  val Session: NameSpace
  var ShowEmptyFields: Boolean
  val SortFields: OrderFields
  val Standard: Boolean
  val ViewFields: typings.activexOutlook.Outlook.ViewFields
  val ViewType: OlViewType
  var Width: Double
  var XML: String
  def Apply(): Unit
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  def Delete(): Unit
  def GoToDate(Date: VarDate): Unit
  def Reset(): Unit
  def Save(): Unit
}

object CardView {
  @scala.inline
  def apply(
    AllowInCellEditing: Boolean,
    Application: Application,
    Apply: () => Unit,
    AutoFormatRules: AutoFormatRules,
    BodyFont: ViewFont,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: () => Unit,
    Filter: String,
    GoToDate: VarDate => Unit,
    HeadingsFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    MultiLineFieldHeight: Double,
    Name: String,
    OutlookDotCardView_typekey: CardView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowEmptyFields: Boolean,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewFields: ViewFields,
    ViewType: OlViewType,
    Width: Double,
    XML: String
  ): CardView = {
    val __obj = js.Dynamic.literal(AllowInCellEditing = AllowInCellEditing.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), AutoFormatRules = AutoFormatRules.asInstanceOf[js.Any], BodyFont = BodyFont.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), HeadingsFont = HeadingsFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], MultiLineFieldHeight = MultiLineFieldHeight.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowEmptyFields = ShowEmptyFields.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewFields = ViewFields.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CardView_typekey")(OutlookDotCardView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardView]
  }
}

