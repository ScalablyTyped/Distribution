package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormRegion extends StObject {
  
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
  
  def Reflow(): Unit
  
  def Select(): Unit
  
  val Session: NameSpace
  
  def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit
  
  var SuppressControlReplacement: Boolean
  
  var Visible: Boolean
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
  implicit class FormRegionMutableBuilder[Self <: FormRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoLayout(value: Boolean): Self = StObject.set(x, "EnableAutoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: js.Any): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormRegionMode(value: OlFormRegionMode): Self = StObject.set(x, "FormRegionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspector(value: Inspector): Self = StObject.set(x, "Inspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalName(value: String): Self = StObject.set(x, "InternalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "IsExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotFormRegion_typekey(value: FormRegion): Self = StObject.set(x, "Outlook.FormRegion_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflow(value: () => Unit): Self = StObject.set(x, "Reflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetControlItemProperty(value: (js.Any, String) => Unit): Self = StObject.set(x, "SetControlItemProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuppressControlReplacement(value: Boolean): Self = StObject.set(x, "SuppressControlReplacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
