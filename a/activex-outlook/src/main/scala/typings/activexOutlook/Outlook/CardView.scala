package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardView extends StObject {
  
  var AllowInCellEditing: Boolean = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  def Apply(): Unit = js.native
  
  val AutoFormatRules: typings.activexOutlook.Outlook.AutoFormatRules = js.native
  
  val BodyFont: ViewFont = js.native
  
  val Class: OlObjectClass = js.native
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  
  def Delete(): Unit = js.native
  
  var Filter: String = js.native
  
  def GoToDate(Date: VarDate): Unit = js.native
  
  val HeadingsFont: ViewFont = js.native
  
  var Language: String = js.native
  
  var LockUserChanges: Boolean = js.native
  
  var MultiLineFieldHeight: Double = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.CardView_typekey")
  var OutlookDotCardView_typekey: CardView = js.native
  
  val Parent: js.Any = js.native
  
  def Reset(): Unit = js.native
  
  def Save(): Unit = js.native
  
  val SaveOption: OlViewSaveOption = js.native
  
  val Session: NameSpace = js.native
  
  var ShowEmptyFields: Boolean = js.native
  
  val SortFields: OrderFields = js.native
  
  val Standard: Boolean = js.native
  
  val ViewFields: typings.activexOutlook.Outlook.ViewFields = js.native
  
  val ViewType: OlViewType = js.native
  
  var Width: Double = js.native
  
  var XML: String = js.native
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
  
  @scala.inline
  implicit class CardViewMutableBuilder[Self <: CardView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowInCellEditing(value: Boolean): Self = StObject.set(x, "AllowInCellEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoFormatRules(value: AutoFormatRules): Self = StObject.set(x, "AutoFormatRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFont(value: ViewFont): Self = StObject.set(x, "BodyFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToDate(value: VarDate => Unit): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadingsFont(value: ViewFont): Self = StObject.set(x, "HeadingsFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLineFieldHeight(value: Double): Self = StObject.set(x, "MultiLineFieldHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotCardView_typekey(value: CardView): Self = StObject.set(x, "Outlook.CardView_typekey", value.asInstanceOf[js.Any])
    
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
    def setShowEmptyFields(value: Boolean): Self = StObject.set(x, "ShowEmptyFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFields(value: OrderFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFields(value: ViewFields): Self = StObject.set(x, "ViewFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
