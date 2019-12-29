package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PrintOptions")
@js.native
class PrintOptions protected () extends js.Object {
  var ActivePrinter: String = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
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

