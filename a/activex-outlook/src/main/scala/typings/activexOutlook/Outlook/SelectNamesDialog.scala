package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectNamesDialog extends js.Object {
  
  var AllowMultipleSelection: Boolean = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var BccLabel: String = js.native
  
  var Caption: String = js.native
  
  var CcLabel: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Display(): Boolean = js.native
  
  var ForceResolution: Boolean = js.native
  
  var InitialAddressList: AddressList = js.native
  
  var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  
  @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: SelectNamesDialog = js.native
  
  val Parent: js.Any = js.native
  
  var Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  
  val Session: NameSpace = js.native
  
  def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
  
  var ShowOnlyInitialAddressList: Boolean = js.native
  
  var ToLabel: String = js.native
}
object SelectNamesDialog {
  
  @scala.inline
  def apply(
    AllowMultipleSelection: Boolean,
    Application: Application,
    BccLabel: String,
    Caption: String,
    CcLabel: String,
    Class: OlObjectClass,
    Display: () => Boolean,
    ForceResolution: Boolean,
    InitialAddressList: AddressList,
    NumberOfRecipientSelectors: OlRecipientSelectors,
    OutlookDotSelectNamesDialog_typekey: SelectNamesDialog,
    Parent: js.Any,
    Recipients: Recipients,
    Session: NameSpace,
    SetDefaultDisplayMode: OlDefaultSelectNamesDisplayMode => Unit,
    ShowOnlyInitialAddressList: Boolean,
    ToLabel: String
  ): SelectNamesDialog = {
    val __obj = js.Dynamic.literal(AllowMultipleSelection = AllowMultipleSelection.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BccLabel = BccLabel.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], CcLabel = CcLabel.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Display = js.Any.fromFunction0(Display), ForceResolution = ForceResolution.asInstanceOf[js.Any], InitialAddressList = InitialAddressList.asInstanceOf[js.Any], NumberOfRecipientSelectors = NumberOfRecipientSelectors.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetDefaultDisplayMode = js.Any.fromFunction1(SetDefaultDisplayMode), ShowOnlyInitialAddressList = ShowOnlyInitialAddressList.asInstanceOf[js.Any], ToLabel = ToLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SelectNamesDialog_typekey")(OutlookDotSelectNamesDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectNamesDialog]
  }
  
  @scala.inline
  implicit class SelectNamesDialogOps[Self <: SelectNamesDialog] (val x: Self) extends AnyVal {
    
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
    def setAllowMultipleSelection(value: Boolean): Self = this.set("AllowMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccLabel(value: String): Self = this.set("BccLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcLabel(value: String): Self = this.set("CcLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: () => Boolean): Self = this.set("Display", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceResolution(value: Boolean): Self = this.set("ForceResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAddressList(value: AddressList): Self = this.set("InitialAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecipientSelectors(value: OlRecipientSelectors): Self = this.set("NumberOfRecipientSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotSelectNamesDialog_typekey(value: SelectNamesDialog): Self = this.set("Outlook.SelectNamesDialog_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: Recipients): Self = this.set("Recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultDisplayMode(value: OlDefaultSelectNamesDisplayMode => Unit): Self = this.set("SetDefaultDisplayMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowOnlyInitialAddressList(value: Boolean): Self = this.set("ShowOnlyInitialAddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLabel(value: String): Self = this.set("ToLabel", value.asInstanceOf[js.Any])
  }
}
