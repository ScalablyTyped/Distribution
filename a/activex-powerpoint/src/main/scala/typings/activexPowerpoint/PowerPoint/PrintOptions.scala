package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintOptions extends js.Object {
  var ActivePrinter: String
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Collate: MsoTriState
  var FitToPage: MsoTriState
  var FrameSlides: MsoTriState
  var HandoutOrder: PpPrintHandoutOrder
  var HighQuality: MsoTriState
  var NumberOfCopies: Double
  var OutputType: PpPrintOutputType
  val Parent: js.Any
  @JSName("PowerPoint.PrintOptions_typekey")
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
}

