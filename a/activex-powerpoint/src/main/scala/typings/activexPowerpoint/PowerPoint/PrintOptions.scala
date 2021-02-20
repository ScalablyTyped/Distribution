package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintOptions extends StObject {
  
  var ActivePrinter: String = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var Collate: MsoTriState = js.native
  
  var FitToPage: MsoTriState = js.native
  
  var FrameSlides: MsoTriState = js.native
  
  var HandoutOrder: PpPrintHandoutOrder = js.native
  
  var HighQuality: MsoTriState = js.native
  
  var NumberOfCopies: Double = js.native
  
  var OutputType: PpPrintOutputType = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PrintOptions_typekey")
  var PowerPointDotPrintOptions_typekey: PrintOptions = js.native
  
  var PrintColorType: PpPrintColorType = js.native
  
  var PrintComments: MsoTriState = js.native
  
  var PrintFontsAsGraphics: MsoTriState = js.native
  
  var PrintHiddenSlides: MsoTriState = js.native
  
  var PrintInBackground: MsoTriState = js.native
  
  var RangeType: PpPrintRangeType = js.native
  
  val Ranges: PrintRanges = js.native
  
  var SlideShowName: String = js.native
  
  var sectionIndex: Double = js.native
}
object PrintOptions {
  
  @scala.inline
  def apply(
    ActivePrinter: String,
    Application: Application,
    Collate: MsoTriState,
    FitToPage: MsoTriState,
    FrameSlides: MsoTriState,
    HandoutOrder: PpPrintHandoutOrder,
    HighQuality: MsoTriState,
    NumberOfCopies: Double,
    OutputType: PpPrintOutputType,
    Parent: js.Any,
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
  implicit class PrintOptionsMutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivePrinter(value: String): Self = StObject.set(x, "ActivePrinter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollate(value: MsoTriState): Self = StObject.set(x, "Collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToPage(value: MsoTriState): Self = StObject.set(x, "FitToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSlides(value: MsoTriState): Self = StObject.set(x, "FrameSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandoutOrder(value: PpPrintHandoutOrder): Self = StObject.set(x, "HandoutOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighQuality(value: MsoTriState): Self = StObject.set(x, "HighQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfCopies(value: Double): Self = StObject.set(x, "NumberOfCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputType(value: PpPrintOutputType): Self = StObject.set(x, "OutputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPrintOptions_typekey(value: PrintOptions): Self = StObject.set(x, "PowerPoint.PrintOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintColorType(value: PpPrintColorType): Self = StObject.set(x, "PrintColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintComments(value: MsoTriState): Self = StObject.set(x, "PrintComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintFontsAsGraphics(value: MsoTriState): Self = StObject.set(x, "PrintFontsAsGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintHiddenSlides(value: MsoTriState): Self = StObject.set(x, "PrintHiddenSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintInBackground(value: MsoTriState): Self = StObject.set(x, "PrintInBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeType(value: PpPrintRangeType): Self = StObject.set(x, "RangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanges(value: PrintRanges): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
  }
}
