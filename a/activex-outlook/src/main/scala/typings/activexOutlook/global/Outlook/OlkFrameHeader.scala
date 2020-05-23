package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAlignment
import typings.activexOutlook.Outlook.OlMousePointer
import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkFrameHeader")
@js.native
class OlkFrameHeader protected ()
  extends typings.activexOutlook.Outlook.OlkFrameHeader {
  /* CompleteClass */
  override var Alignment: OlAlignment = js.native
  /* CompleteClass */
  override var Caption: String = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override val Font: StdFont = js.native
  /* CompleteClass */
  override var ForeColor: OLE_COLOR = js.native
  /* CompleteClass */
  override var MouseIcon: StdPicture = js.native
  /* CompleteClass */
  override var MousePointer: OlMousePointer = js.native
  /* CompleteClass */
  @JSName("Outlook.OlkFrameHeader_typekey")
  override var OutlookDotOlkFrameHeader_typekey: typings.activexOutlook.Outlook.OlkFrameHeader = js.native
}

