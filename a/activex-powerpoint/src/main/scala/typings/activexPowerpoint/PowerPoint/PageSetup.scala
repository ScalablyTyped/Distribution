package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSetup extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var FirstSlideNumber: Double
  
  var NotesOrientation: MsoOrientation
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: PageSetup
  
  var SlideHeight: Double
  
  var SlideOrientation: MsoOrientation
  
  var SlideSize: PpSlideSizeType
  
  var SlideWidth: Double
}
object PageSetup {
  
  inline def apply(
    Application: Application,
    FirstSlideNumber: Double,
    NotesOrientation: MsoOrientation,
    Parent: Any,
    PowerPointDotPageSetup_typekey: PageSetup,
    SlideHeight: Double,
    SlideOrientation: MsoOrientation,
    SlideSize: PpSlideSizeType,
    SlideWidth: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstSlideNumber = FirstSlideNumber.asInstanceOf[js.Any], NotesOrientation = NotesOrientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideHeight = SlideHeight.asInstanceOf[js.Any], SlideOrientation = SlideOrientation.asInstanceOf[js.Any], SlideSize = SlideSize.asInstanceOf[js.Any], SlideWidth = SlideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PageSetup_typekey")(PowerPointDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageSetup] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setFirstSlideNumber(value: Double): Self = StObject.set(x, "FirstSlideNumber", value.asInstanceOf[js.Any])
    
    inline def setNotesOrientation(value: MsoOrientation): Self = StObject.set(x, "NotesOrientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPageSetup_typekey(value: PageSetup): Self = StObject.set(x, "PowerPoint.PageSetup_typekey", value.asInstanceOf[js.Any])
    
    inline def setSlideHeight(value: Double): Self = StObject.set(x, "SlideHeight", value.asInstanceOf[js.Any])
    
    inline def setSlideOrientation(value: MsoOrientation): Self = StObject.set(x, "SlideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSlideSize(value: PpSlideSizeType): Self = StObject.set(x, "SlideSize", value.asInstanceOf[js.Any])
    
    inline def setSlideWidth(value: Double): Self = StObject.set(x, "SlideWidth", value.asInstanceOf[js.Any])
  }
}
