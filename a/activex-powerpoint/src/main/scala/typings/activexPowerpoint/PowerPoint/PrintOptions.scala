package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintOptions extends StObject {
  
  var ActivePrinter: String
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Collate: MsoTriState
  
  var FitToPage: MsoTriState
  
  var FrameSlides: MsoTriState
  
  var HandoutOrder: PpPrintHandoutOrder
  
  var HighQuality: MsoTriState
  
  var NumberOfCopies: Double
  
  var OutputType: PpPrintOutputType
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.PrintOptions_typekey")
  var PowerPointDotPrintOptions_typekey: PrintOptions
  
  var PrintColorType: PpPrintColorType
  
  var PrintComments: MsoTriState
  
  var PrintFontsAsGraphics: MsoTriState
  
  var PrintHiddenSlides: MsoTriState
  
  var PrintInBackground: MsoTriState
  
  var RangeType: PpPrintRangeType
  
  val Ranges: PrintRanges
  
  var SlideShowName: String
  
  var sectionIndex: Double
}
object PrintOptions {
  
  inline def apply(
    ActivePrinter: String,
    Application: Application,
    Collate: MsoTriState,
    FitToPage: MsoTriState,
    FrameSlides: MsoTriState,
    HandoutOrder: PpPrintHandoutOrder,
    HighQuality: MsoTriState,
    NumberOfCopies: Double,
    OutputType: PpPrintOutputType,
    Parent: Any,
    PowerPointDotPrintOptions_typekey: PrintOptions,
    PrintColorType: PpPrintColorType,
    PrintComments: MsoTriState,
    PrintFontsAsGraphics: MsoTriState,
    PrintHiddenSlides: MsoTriState,
    PrintInBackground: MsoTriState,
    RangeType: PpPrintRangeType,
    Ranges: PrintRanges,
    SlideShowName: String,
    sectionIndex: Double
  ): PrintOptions = {
    val __obj = js.Dynamic.literal(ActivePrinter = ActivePrinter.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Collate = Collate.asInstanceOf[js.Any], FitToPage = FitToPage.asInstanceOf[js.Any], FrameSlides = FrameSlides.asInstanceOf[js.Any], HandoutOrder = HandoutOrder.asInstanceOf[js.Any], HighQuality = HighQuality.asInstanceOf[js.Any], NumberOfCopies = NumberOfCopies.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintColorType = PrintColorType.asInstanceOf[js.Any], PrintComments = PrintComments.asInstanceOf[js.Any], PrintFontsAsGraphics = PrintFontsAsGraphics.asInstanceOf[js.Any], PrintHiddenSlides = PrintHiddenSlides.asInstanceOf[js.Any], PrintInBackground = PrintInBackground.asInstanceOf[js.Any], RangeType = RangeType.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintOptions_typekey")(PowerPointDotPrintOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
    
    inline def setActivePrinter(value: String): Self = StObject.set(x, "ActivePrinter", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCollate(value: MsoTriState): Self = StObject.set(x, "Collate", value.asInstanceOf[js.Any])
    
    inline def setFitToPage(value: MsoTriState): Self = StObject.set(x, "FitToPage", value.asInstanceOf[js.Any])
    
    inline def setFrameSlides(value: MsoTriState): Self = StObject.set(x, "FrameSlides", value.asInstanceOf[js.Any])
    
    inline def setHandoutOrder(value: PpPrintHandoutOrder): Self = StObject.set(x, "HandoutOrder", value.asInstanceOf[js.Any])
    
    inline def setHighQuality(value: MsoTriState): Self = StObject.set(x, "HighQuality", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCopies(value: Double): Self = StObject.set(x, "NumberOfCopies", value.asInstanceOf[js.Any])
    
    inline def setOutputType(value: PpPrintOutputType): Self = StObject.set(x, "OutputType", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPrintOptions_typekey(value: PrintOptions): Self = StObject.set(x, "PowerPoint.PrintOptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setPrintColorType(value: PpPrintColorType): Self = StObject.set(x, "PrintColorType", value.asInstanceOf[js.Any])
    
    inline def setPrintComments(value: MsoTriState): Self = StObject.set(x, "PrintComments", value.asInstanceOf[js.Any])
    
    inline def setPrintFontsAsGraphics(value: MsoTriState): Self = StObject.set(x, "PrintFontsAsGraphics", value.asInstanceOf[js.Any])
    
    inline def setPrintHiddenSlides(value: MsoTriState): Self = StObject.set(x, "PrintHiddenSlides", value.asInstanceOf[js.Any])
    
    inline def setPrintInBackground(value: MsoTriState): Self = StObject.set(x, "PrintInBackground", value.asInstanceOf[js.Any])
    
    inline def setRangeType(value: PpPrintRangeType): Self = StObject.set(x, "RangeType", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: PrintRanges): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
    
    inline def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    inline def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
  }
}
