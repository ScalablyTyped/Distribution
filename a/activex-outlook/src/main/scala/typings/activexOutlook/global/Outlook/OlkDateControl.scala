package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlBackStyle
import typings.activexOutlook.Outlook.OlEnterFieldBehavior
import typings.activexOutlook.Outlook.OlMousePointer
import typings.activexOutlook.Outlook.OlTextAlign
import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkDateControl")
@js.native
class OlkDateControl protected ()
  extends typings.activexOutlook.Outlook.OlkDateControl {
  /* CompleteClass */
  override var AutoSize: Boolean = js.native
  /* CompleteClass */
  override var AutoWordSelect: Boolean = js.native
  /* CompleteClass */
  override var BackColor: OLE_COLOR = js.native
  /* CompleteClass */
  override var BackStyle: OlBackStyle = js.native
  /* CompleteClass */
  override var Date: VarDate = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  /* CompleteClass */
  override val Font: StdFont = js.native
  /* CompleteClass */
  override var ForeColor: OLE_COLOR = js.native
  /* CompleteClass */
  override var HideSelection: Boolean = js.native
  /* CompleteClass */
  override var Locked: Boolean = js.native
  /* CompleteClass */
  override var MouseIcon: StdPicture = js.native
  /* CompleteClass */
  override var MousePointer: OlMousePointer = js.native
  /* CompleteClass */
  @JSName("Outlook.OlkDateControl_typekey")
  override var OutlookDotOlkDateControl_typekey: typings.activexOutlook.Outlook.OlkDateControl = js.native
  /* CompleteClass */
  override var ShowNoneButton: Boolean = js.native
  /* CompleteClass */
  override var Text: String = js.native
  /* CompleteClass */
  override var TextAlign: OlTextAlign = js.native
  /* CompleteClass */
  override var Value: js.Any = js.native
  /* CompleteClass */
  override def DropDown(): Unit = js.native
}

