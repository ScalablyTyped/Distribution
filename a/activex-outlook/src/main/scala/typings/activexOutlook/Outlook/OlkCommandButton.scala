package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkCommandButton")
@js.native
class OlkCommandButton protected () extends js.Object {
  var Accelerator: String = js.native
  var AutoSize: Boolean = js.native
  var Caption: String = js.native
  var DisplayDropArrow: Boolean = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkCommandButton_typekey")
  var OutlookDotOlkCommandButton_typekey: OlkCommandButton = js.native
  var Picture: StdPicture = js.native
  var PictureAlignment: OlPictureAlignment = js.native
  var TextAlign: OlTextAlign = js.native
  var WordWrap: Boolean = js.native
}

