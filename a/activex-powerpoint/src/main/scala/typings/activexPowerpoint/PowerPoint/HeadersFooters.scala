package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadersFooters extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def Clear(): Unit = js.native
  
  val DateAndTime: HeaderFooter = js.native
  
  var DisplayOnTitleSlide: MsoTriState = js.native
  
  val Footer: HeaderFooter = js.native
  
  val Header: HeaderFooter = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.HeadersFooters_typekey")
  var PowerPointDotHeadersFooters_typekey: HeadersFooters = js.native
  
  val SlideNumber: HeaderFooter = js.native
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
  
  @scala.inline
  implicit class HeadersFootersOps[Self <: HeadersFooters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDateAndTime(value: HeaderFooter): Self = this.set("DateAndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOnTitleSlide(value: MsoTriState): Self = this.set("DisplayOnTitleSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: HeaderFooter): Self = this.set("Footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: HeaderFooter): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHeadersFooters_typekey(value: HeadersFooters): Self = this.set("PowerPoint.HeadersFooters_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideNumber(value: HeaderFooter): Self = this.set("SlideNumber", value.asInstanceOf[js.Any])
  }
}
