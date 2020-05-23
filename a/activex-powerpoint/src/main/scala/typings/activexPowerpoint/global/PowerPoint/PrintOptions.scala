package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpPrintColorType
import typings.activexPowerpoint.PowerPoint.PpPrintHandoutOrder
import typings.activexPowerpoint.PowerPoint.PpPrintOutputType
import typings.activexPowerpoint.PowerPoint.PpPrintRangeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PrintOptions")
@js.native
class PrintOptions protected ()
  extends typings.activexPowerpoint.PowerPoint.PrintOptions {
  /* CompleteClass */
  override var ActivePrinter: String = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Collate: MsoTriState = js.native
  /* CompleteClass */
  override var FitToPage: MsoTriState = js.native
  /* CompleteClass */
  override var FrameSlides: MsoTriState = js.native
  /* CompleteClass */
  override var HandoutOrder: PpPrintHandoutOrder = js.native
  /* CompleteClass */
  override var HighQuality: MsoTriState = js.native
  /* CompleteClass */
  override var NumberOfCopies: Double = js.native
  /* CompleteClass */
  override var OutputType: PpPrintOutputType = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PrintOptions_typekey")
  override var PowerPointDotPrintOptions_typekey: typings.activexPowerpoint.PowerPoint.PrintOptions = js.native
  /* CompleteClass */
  override var PrintColorType: PpPrintColorType = js.native
  /* CompleteClass */
  override var PrintComments: MsoTriState = js.native
  /* CompleteClass */
  override var PrintFontsAsGraphics: MsoTriState = js.native
  /* CompleteClass */
  override var PrintHiddenSlides: MsoTriState = js.native
  /* CompleteClass */
  override var PrintInBackground: MsoTriState = js.native
  /* CompleteClass */
  override var RangeType: PpPrintRangeType = js.native
  /* CompleteClass */
  override val Ranges: typings.activexPowerpoint.PowerPoint.PrintRanges = js.native
  /* CompleteClass */
  override var SlideShowName: String = js.native
  /* CompleteClass */
  override var sectionIndex: Double = js.native
}

