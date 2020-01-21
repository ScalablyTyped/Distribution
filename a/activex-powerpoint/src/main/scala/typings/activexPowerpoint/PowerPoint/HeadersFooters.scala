package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.HeadersFooters")
@js.native
class HeadersFooters protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val DateAndTime: HeaderFooter = js.native
  var DisplayOnTitleSlide: MsoTriState = js.native
  val Footer: HeaderFooter = js.native
  val Header: HeaderFooter = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.HeadersFooters_typekey")
  var PowerPointDotHeadersFooters_typekey: HeadersFooters = js.native
  val SlideNumber: HeaderFooter = js.native
  def Clear(): Unit = js.native
}

