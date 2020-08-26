package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormRegion extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Detail: String = js.native
  val DisplayName: String = js.native
  var EnableAutoLayout: Boolean = js.native
  val Form: js.Any = js.native
  val FormRegionMode: OlFormRegionMode = js.native
  val Inspector: typings.activexOutlook.Outlook.Inspector = js.native
  val InternalName: String = js.native
  val IsExpanded: Boolean = js.native
  val Item: js.Any = js.native
  val Language: Double = js.native
  @JSName("Outlook.FormRegion_typekey")
  var OutlookDotFormRegion_typekey: FormRegion = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var SuppressControlReplacement: Boolean = js.native
  var Visible: Boolean = js.native
  def Reflow(): Unit = js.native
  def Select(): Unit = js.native
  def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit = js.native
}

object FormRegion {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Detail: String,
    DisplayName: String,
    EnableAutoLayout: Boolean,
    Form: js.Any,
    FormRegionMode: OlFormRegionMode,
    Inspector: Inspector,
    InternalName: String,
    IsExpanded: Boolean,
    Item: js.Any,
    Language: Double,
    OutlookDotFormRegion_typekey: FormRegion,
    Parent: js.Any,
    Reflow: () => Unit,
    Select: () => Unit,
    Session: NameSpace,
    SetControlItemProperty: (js.Any, String) => Unit,
    SuppressControlReplacement: Boolean,
    Visible: Boolean
  ): FormRegion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EnableAutoLayout = EnableAutoLayout.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], FormRegionMode = FormRegionMode.asInstanceOf[js.Any], Inspector = Inspector.asInstanceOf[js.Any], InternalName = InternalName.asInstanceOf[js.Any], IsExpanded = IsExpanded.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reflow = js.Any.fromFunction0(Reflow), Select = js.Any.fromFunction0(Select), Session = Session.asInstanceOf[js.Any], SetControlItemProperty = js.Any.fromFunction2(SetControlItemProperty), SuppressControlReplacement = SuppressControlReplacement.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FormRegion_typekey")(OutlookDotFormRegion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRegion]
  }
  @scala.inline
  implicit class FormRegionOps[Self <: FormRegion] (val x: Self) extends AnyVal {
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
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: String): Self = this.set("Detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableAutoLayout(value: Boolean): Self = this.set("EnableAutoLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setForm(value: js.Any): Self = this.set("Form", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormRegionMode(value: OlFormRegionMode): Self = this.set("FormRegionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspector(value: Inspector): Self = this.set("Inspector", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalName(value: String): Self = this.set("InternalName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("IsExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Double): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotFormRegion_typekey(value: FormRegion): Self = this.set("Outlook.FormRegion_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReflow(value: () => Unit): Self = this.set("Reflow", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetControlItemProperty(value: (js.Any, String) => Unit): Self = this.set("SetControlItemProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setSuppressControlReplacement(value: Boolean): Self = this.set("SuppressControlReplacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

