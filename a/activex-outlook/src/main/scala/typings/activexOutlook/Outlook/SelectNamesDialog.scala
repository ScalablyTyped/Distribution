package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectNamesDialog extends js.Object {
  var AllowMultipleSelection: Boolean
  val Application: typings.activexOutlook.Outlook.Application
  var BccLabel: String
  var Caption: String
  var CcLabel: String
  val Class: OlObjectClass
  var ForceResolution: Boolean
  var InitialAddressList: AddressList
  var NumberOfRecipientSelectors: OlRecipientSelectors
  @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: SelectNamesDialog
  val Parent: js.Any
  var Recipients: typings.activexOutlook.Outlook.Recipients
  val Session: NameSpace
  var ShowOnlyInitialAddressList: Boolean
  var ToLabel: String
  def Display(): Boolean
  def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit
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
}

