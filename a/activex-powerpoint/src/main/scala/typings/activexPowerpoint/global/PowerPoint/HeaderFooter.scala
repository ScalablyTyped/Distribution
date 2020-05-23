package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpDateTimeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.HeaderFooter")
@js.native
class HeaderFooter protected ()
  extends typings.activexPowerpoint.PowerPoint.HeaderFooter {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Format: PpDateTimeFormat = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.HeaderFooter_typekey")
  override var PowerPointDotHeaderFooter_typekey: typings.activexPowerpoint.PowerPoint.HeaderFooter = js.native
  /* CompleteClass */
  override var Text: String = js.native
  /* CompleteClass */
  override var UseFormat: MsoTriState = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
}

