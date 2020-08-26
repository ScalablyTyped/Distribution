package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineView extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  var EndField: String = js.native
  var Filter: String = js.native
  val GroupByFields: OrderFields = js.native
  val ItemFont: ViewFont = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  val LowerScaleFont: ViewFont = js.native
  var MaxLabelWidth: Double = js.native
  var Name: String = js.native
  @JSName("Outlook.TimelineView_typekey")
  var OutlookDotTimelineView_typekey: TimelineView = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  var ShowLabelWhenViewingByMonth: Boolean = js.native
  var ShowWeekNumbers: Boolean = js.native
  val Standard: Boolean = js.native
  var StartField: String = js.native
  var TimelineViewMode: OlTimelineViewMode = js.native
  val UpperScaleFont: ViewFont = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
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
  @scala.inline
  implicit class TimelineViewOps[Self <: TimelineView] (val x: Self) extends AnyVal {
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
    def setApply(value: () => Unit): Self = this.set("Apply", js.Any.fromFunction0(value))
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: (String, OlViewSaveOption) => View): Self = this.set("Copy", js.Any.fromFunction2(value))
    @scala.inline
    def setDefaultExpandCollapseSetting(value: OlDefaultExpandCollapseSetting): Self = this.set("DefaultExpandCollapseSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEndField(value: String): Self = this.set("EndField", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToDate(value: VarDate => Unit): Self = this.set("GoToDate", js.Any.fromFunction1(value))
    @scala.inline
    def setGroupByFields(value: OrderFields): Self = this.set("GroupByFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemFont(value: ViewFont): Self = this.set("ItemFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockUserChanges(value: Boolean): Self = this.set("LockUserChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowerScaleFont(value: ViewFont): Self = this.set("LowerScaleFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLabelWidth(value: Double): Self = this.set("MaxLabelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotTimelineView_typekey(value: TimelineView): Self = this.set("Outlook.TimelineView_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    @scala.inline
    def setSaveOption(value: OlViewSaveOption): Self = this.set("SaveOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowLabelWhenViewingByMonth(value: Boolean): Self = this.set("ShowLabelWhenViewingByMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("ShowWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: Boolean): Self = this.set("Standard", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartField(value: String): Self = this.set("StartField", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineViewMode(value: OlTimelineViewMode): Self = this.set("TimelineViewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpperScaleFont(value: ViewFont): Self = this.set("UpperScaleFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewType(value: OlViewType): Self = this.set("ViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def setXML(value: String): Self = this.set("XML", value.asInstanceOf[js.Any])
  }
  
}

