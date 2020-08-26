package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Filter: String = js.native
  var Language: String = js.native
  var LockUserChanges: Boolean = js.native
  var Name: String = js.native
  @JSName("Outlook.View_typekey")
  var OutlookDotView_typekey: View = js.native
  val Parent: js.Any = js.native
  val SaveOption: OlViewSaveOption = js.native
  val Session: NameSpace = js.native
  val Standard: Boolean = js.native
  val ViewType: OlViewType = js.native
  var XML: String = js.native
  def Apply(): Unit = js.native
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  def Delete(): Unit = js.native
  def GoToDate(Date: VarDate): Unit = js.native
  def Reset(): Unit = js.native
  def Save(): Unit = js.native
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
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToDate(value: VarDate => Unit): Self = this.set("GoToDate", js.Any.fromFunction1(value))
    @scala.inline
    def setLanguage(value: String): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockUserChanges(value: Boolean): Self = this.set("LockUserChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotView_typekey(value: View): Self = this.set("Outlook.View_typekey", value.asInstanceOf[js.Any])
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
    def setStandard(value: Boolean): Self = this.set("Standard", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewType(value: OlViewType): Self = this.set("ViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def setXML(value: String): Self = this.set("XML", value.asInstanceOf[js.Any])
  }
  
}

