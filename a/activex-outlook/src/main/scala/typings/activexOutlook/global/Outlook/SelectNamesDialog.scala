package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlDefaultSelectNamesDisplayMode
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRecipientSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SelectNamesDialog")
@js.native
class SelectNamesDialog protected ()
  extends typings.activexOutlook.Outlook.SelectNamesDialog {
  /* CompleteClass */
  override var AllowMultipleSelection: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override var BccLabel: String = js.native
  /* CompleteClass */
  override var Caption: String = js.native
  /* CompleteClass */
  override var CcLabel: String = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var ForceResolution: Boolean = js.native
  /* CompleteClass */
  override var InitialAddressList: typings.activexOutlook.Outlook.AddressList = js.native
  /* CompleteClass */
  override var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  /* CompleteClass */
  @JSName("Outlook.SelectNamesDialog_typekey")
  override var OutlookDotSelectNamesDialog_typekey: typings.activexOutlook.Outlook.SelectNamesDialog = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var ShowOnlyInitialAddressList: Boolean = js.native
  /* CompleteClass */
  override var ToLabel: String = js.native
  /* CompleteClass */
  override def Display(): Boolean = js.native
  /* CompleteClass */
  override def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
}

