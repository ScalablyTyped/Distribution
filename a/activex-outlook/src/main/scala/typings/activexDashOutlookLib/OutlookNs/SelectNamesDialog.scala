package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SelectNamesDialog")
@js.native
class SelectNamesDialog protected () extends js.Object {
  var AllowMultipleSelection: scala.Boolean = js.native
  val Application: Application = js.native
  var BccLabel: java.lang.String = js.native
  var Caption: java.lang.String = js.native
  var CcLabel: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var ForceResolution: scala.Boolean = js.native
  var InitialAddressList: AddressList = js.native
  var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  var `Outlook.SelectNamesDialog_typekey`: SelectNamesDialog = js.native
  val Parent: js.Any = js.native
  var Recipients: Recipients = js.native
  val Session: NameSpace = js.native
  var ShowOnlyInitialAddressList: scala.Boolean = js.native
  var ToLabel: java.lang.String = js.native
  def Display(): scala.Boolean = js.native
  def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): scala.Unit = js.native
}

