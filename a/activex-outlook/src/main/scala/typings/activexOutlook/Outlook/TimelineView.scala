package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineView extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting
  var EndField: String
  var Filter: String
  val GroupByFields: OrderFields
  val ItemFont: ViewFont
  var Language: String
  var LockUserChanges: Boolean
  val LowerScaleFont: ViewFont
  var MaxLabelWidth: Double
  var Name: String
  @JSName("Outlook.TimelineView_typekey")
  var OutlookDotTimelineView_typekey: TimelineView
  val Parent: js.Any
  val SaveOption: OlViewSaveOption
  val Session: NameSpace
  var ShowLabelWhenViewingByMonth: Boolean
  var ShowWeekNumbers: Boolean
  val Standard: Boolean
  var StartField: String
  var TimelineViewMode: OlTimelineViewMode
  val UpperScaleFont: ViewFont
  val ViewType: OlViewType
  var XML: String
  def Apply(): Unit
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  def Delete(): Unit
  def GoToDate(Date: VarDate): Unit
  def Reset(): Unit
  def Save(): Unit
}

object TimelineView {
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting,
    Delete: () => Unit,
    EndField: String,
    Filter: String,
    GoToDate: VarDate => Unit,
    GroupByFields: OrderFields,
    ItemFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    LowerScaleFont: ViewFont,
    MaxLabelWidth: Double,
    Name: String,
    OutlookDotTimelineView_typekey: TimelineView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowLabelWhenViewingByMonth: Boolean,
    ShowWeekNumbers: Boolean,
    Standard: Boolean,
    StartField: String,
    TimelineViewMode: OlTimelineViewMode,
    UpperScaleFont: ViewFont,
    ViewType: OlViewType,
    XML: String
  ): TimelineView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DefaultExpandCollapseSetting = DefaultExpandCollapseSetting.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EndField = EndField.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), GroupByFields = GroupByFields.asInstanceOf[js.Any], ItemFont = ItemFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], LowerScaleFont = LowerScaleFont.asInstanceOf[js.Any], MaxLabelWidth = MaxLabelWidth.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowLabelWhenViewingByMonth = ShowLabelWhenViewingByMonth.asInstanceOf[js.Any], ShowWeekNumbers = ShowWeekNumbers.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], StartField = StartField.asInstanceOf[js.Any], TimelineViewMode = TimelineViewMode.asInstanceOf[js.Any], UpperScaleFont = UpperScaleFont.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimelineView_typekey")(OutlookDotTimelineView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineView]
  }
}

