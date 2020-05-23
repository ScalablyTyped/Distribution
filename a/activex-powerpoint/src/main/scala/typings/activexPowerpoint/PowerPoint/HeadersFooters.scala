package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersFooters extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val DateAndTime: HeaderFooter
  var DisplayOnTitleSlide: MsoTriState
  val Footer: HeaderFooter
  val Header: HeaderFooter
  val Parent: js.Any
  @JSName("PowerPoint.HeadersFooters_typekey")
  var PowerPointDotHeadersFooters_typekey: HeadersFooters
  val SlideNumber: HeaderFooter
  def Clear(): Unit
}

object HeadersFooters {
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    DateAndTime: HeaderFooter,
    DisplayOnTitleSlide: MsoTriState,
    Footer: HeaderFooter,
    Header: HeaderFooter,
    Parent: js.Any,
    PowerPointDotHeadersFooters_typekey: HeadersFooters,
    SlideNumber: HeaderFooter
  ): HeadersFooters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), DateAndTime = DateAndTime.asInstanceOf[js.Any], DisplayOnTitleSlide = DisplayOnTitleSlide.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideNumber = SlideNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeadersFooters_typekey")(PowerPointDotHeadersFooters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersFooters]
  }
}

