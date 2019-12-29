package typings.activexDashOutlook.Outlook

import typings.activexDashStdole.stdole.OLE_COLOR
import typings.activexDashStdole.stdole.StdFont
import typings.activexDashStdole.stdole.StdPicture
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkTimeControl")
@js.native
class OlkTimeControl protected () extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var IntervalTime: VarDate = js.native
  var Locked: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkTimeControl_typekey")
  var OutlookDotOlkTimeControl_typekey: OlkTimeControl = js.native
  var ReferenceTime: VarDate = js.native
  var Style: OlTimeStyle = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Time: VarDate = js.native
  var Value: js.Any = js.native
  def DropDown(): Unit = js.native
}

