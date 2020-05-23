package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormRegion extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Detail: String
  val DisplayName: String
  var EnableAutoLayout: Boolean
  val Form: js.Any
  val FormRegionMode: OlFormRegionMode
  val Inspector: typings.activexOutlook.Outlook.Inspector
  val InternalName: String
  val IsExpanded: Boolean
  val Item: js.Any
  val Language: Double
  @JSName("Outlook.FormRegion_typekey")
  var OutlookDotFormRegion_typekey: FormRegion
  val Parent: js.Any
  val Session: NameSpace
  var SuppressControlReplacement: Boolean
  var Visible: Boolean
  def Reflow(): Unit
  def Select(): Unit
  def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit
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
}

