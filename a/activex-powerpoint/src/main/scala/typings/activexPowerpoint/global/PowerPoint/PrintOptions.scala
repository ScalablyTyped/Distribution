package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpPrintColorType
import typings.activexPowerpoint.PowerPoint.PpPrintHandoutOrder
import typings.activexPowerpoint.PowerPoint.PpPrintOutputType
import typings.activexPowerpoint.PowerPoint.PpPrintRangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PrintOptions")
@js.native
class PrintOptions protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.PrintOptions {
  
  /* CompleteClass */
  var ActivePrinter: String = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Collate: MsoTriState = js.native
  
  /* CompleteClass */
  var FitToPage: MsoTriState = js.native
  
  /* CompleteClass */
  var FrameSlides: MsoTriState = js.native
  
  /* CompleteClass */
  var HandoutOrder: PpPrintHandoutOrder = js.native
  
  /* CompleteClass */
  var HighQuality: MsoTriState = js.native
  
  /* CompleteClass */
  var NumberOfCopies: Double = js.native
  
  /* CompleteClass */
  var OutputType: PpPrintOutputType = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.PrintOptions_typekey")
  var PowerPointDotPrintOptions_typekey: typings.activexPowerpoint.PowerPoint.PrintOptions = js.native
  
  /* CompleteClass */
  var PrintColorType: PpPrintColorType = js.native
  
  /* CompleteClass */
  var PrintComments: MsoTriState = js.native
  
  /* CompleteClass */
  var PrintFontsAsGraphics: MsoTriState = js.native
  
  /* CompleteClass */
  var PrintHiddenSlides: MsoTriState = js.native
  
  /* CompleteClass */
  var PrintInBackground: MsoTriState = js.native
  
  /* CompleteClass */
  var RangeType: PpPrintRangeType = js.native
  
  /* CompleteClass */
  override val Ranges: typings.activexPowerpoint.PowerPoint.PrintRanges = js.native
  
  /* CompleteClass */
  var SlideShowName: String = js.native
  
  /* CompleteClass */
  var sectionIndex: Double = js.native
}
