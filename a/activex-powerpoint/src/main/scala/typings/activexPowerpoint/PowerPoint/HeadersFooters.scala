package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersFooters extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def Clear(): Unit
  
  val DateAndTime: HeaderFooter
  
  var DisplayOnTitleSlide: MsoTriState
  
  val Footer: HeaderFooter
  
  val Header: HeaderFooter
  
  val Parent: js.Any
  
  @JSName("PowerPoint.HeadersFooters_typekey")
  var PowerPointDotHeadersFooters_typekey: HeadersFooters
  
  val SlideNumber: HeaderFooter
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
  implicit class HeadersFootersMutableBuilder[Self <: HeadersFooters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDateAndTime(value: HeaderFooter): Self = StObject.set(x, "DateAndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOnTitleSlide(value: MsoTriState): Self = StObject.set(x, "DisplayOnTitleSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: HeaderFooter): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: HeaderFooter): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHeadersFooters_typekey(value: HeadersFooters): Self = StObject.set(x, "PowerPoint.HeadersFooters_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideNumber(value: HeaderFooter): Self = StObject.set(x, "SlideNumber", value.asInstanceOf[js.Any])
  }
}
