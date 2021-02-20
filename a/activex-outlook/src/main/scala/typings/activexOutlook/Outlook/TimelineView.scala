package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineView extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  def Apply(): Unit = js.native
  
  val Class: OlObjectClass = js.native
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  
  def Delete(): Unit = js.native
  
  var EndField: String = js.native
  
  var Filter: String = js.native
  
  def GoToDate(Date: VarDate): Unit = js.native
  
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
  
  def Reset(): Unit = js.native
  
  def Save(): Unit = js.native
  
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
  implicit class TimelineViewMutableBuilder[Self <: TimelineView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefaultExpandCollapseSetting(value: OlDefaultExpandCollapseSetting): Self = StObject.set(x, "DefaultExpandCollapseSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndField(value: String): Self = StObject.set(x, "EndField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToDate(value: VarDate => Unit): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupByFields(value: OrderFields): Self = StObject.set(x, "GroupByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemFont(value: ViewFont): Self = StObject.set(x, "ItemFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerScaleFont(value: ViewFont): Self = StObject.set(x, "LowerScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLabelWidth(value: Double): Self = StObject.set(x, "MaxLabelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotTimelineView_typekey(value: TimelineView): Self = StObject.set(x, "Outlook.TimelineView_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLabelWhenViewingByMonth(value: Boolean): Self = StObject.set(x, "ShowLabelWhenViewingByMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "ShowWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartField(value: String): Self = StObject.set(x, "StartField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineViewMode(value: OlTimelineViewMode): Self = StObject.set(x, "TimelineViewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperScaleFont(value: ViewFont): Self = StObject.set(x, "UpperScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
