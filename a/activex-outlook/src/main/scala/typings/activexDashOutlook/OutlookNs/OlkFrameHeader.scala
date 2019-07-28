package typings.activexDashOutlook.OutlookNs

import typings.activexDashStdole.stdoleNs.OLE_COLOR
import typings.activexDashStdole.stdoleNs.StdFont
import typings.activexDashStdole.stdoleNs.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkFrameHeader")
@js.native
class OlkFrameHeader protected () extends js.Object {
  var Alignment: OlAlignment = js.native
  var Caption: String = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var `Outlook.OlkFrameHeader_typekey`: OlkFrameHeader = js.native
}

