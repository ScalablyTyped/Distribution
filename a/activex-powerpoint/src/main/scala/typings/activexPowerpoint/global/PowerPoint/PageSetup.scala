package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoOrientation
import typings.activexPowerpoint.PowerPoint.PpSlideSizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PageSetup")
@js.native
class PageSetup protected ()
  extends typings.activexPowerpoint.PowerPoint.PageSetup {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var FirstSlideNumber: Double = js.native
  /* CompleteClass */
  override var NotesOrientation: MsoOrientation = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PageSetup_typekey")
  override var PowerPointDotPageSetup_typekey: typings.activexPowerpoint.PowerPoint.PageSetup = js.native
  /* CompleteClass */
  override var SlideHeight: Double = js.native
  /* CompleteClass */
  override var SlideOrientation: MsoOrientation = js.native
  /* CompleteClass */
  override var SlideSize: PpSlideSizeType = js.native
  /* CompleteClass */
  override var SlideWidth: Double = js.native
}

