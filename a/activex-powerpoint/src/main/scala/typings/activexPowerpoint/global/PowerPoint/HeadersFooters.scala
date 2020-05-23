package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.HeadersFooters")
@js.native
class HeadersFooters protected ()
  extends typings.activexPowerpoint.PowerPoint.HeadersFooters {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val DateAndTime: typings.activexPowerpoint.PowerPoint.HeaderFooter = js.native
  /* CompleteClass */
  override var DisplayOnTitleSlide: MsoTriState = js.native
  /* CompleteClass */
  override val Footer: typings.activexPowerpoint.PowerPoint.HeaderFooter = js.native
  /* CompleteClass */
  override val Header: typings.activexPowerpoint.PowerPoint.HeaderFooter = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.HeadersFooters_typekey")
  override var PowerPointDotHeadersFooters_typekey: typings.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  /* CompleteClass */
  override val SlideNumber: typings.activexPowerpoint.PowerPoint.HeaderFooter = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
}

