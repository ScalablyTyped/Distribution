package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkLabel")
@js.native
class OlkLabel protected () extends js.Object {
  var Accelerator: String = js.native
  var AutoSize: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var BorderStyle: OlBorderStyle = js.native
  var Caption: String = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkLabel_typekey")
  var OutlookDotOlkLabel_typekey: OlkLabel = js.native
  var TextAlign: OlTextAlign = js.native
  var UseHeaderColor: Boolean = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
}

