package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintOptions extends js.Object {
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
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
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
    def setActivePrinter(value: String): Self = this.set("ActivePrinter", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollate(value: MsoTriState): Self = this.set("Collate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFitToPage(value: MsoTriState): Self = this.set("FitToPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameSlides(value: MsoTriState): Self = this.set("FrameSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandoutOrder(value: PpPrintHandoutOrder): Self = this.set("HandoutOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighQuality(value: MsoTriState): Self = this.set("HighQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfCopies(value: Double): Self = this.set("NumberOfCopies", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputType(value: PpPrintOutputType): Self = this.set("OutputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotPrintOptions_typekey(value: PrintOptions): Self = this.set("PowerPoint.PrintOptions_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintColorType(value: PpPrintColorType): Self = this.set("PrintColorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintComments(value: MsoTriState): Self = this.set("PrintComments", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintFontsAsGraphics(value: MsoTriState): Self = this.set("PrintFontsAsGraphics", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintHiddenSlides(value: MsoTriState): Self = this.set("PrintHiddenSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintInBackground(value: MsoTriState): Self = this.set("PrintInBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeType(value: PpPrintRangeType): Self = this.set("RangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanges(value: PrintRanges): Self = this.set("Ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideShowName(value: String): Self = this.set("SlideShowName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
  }
  
}

