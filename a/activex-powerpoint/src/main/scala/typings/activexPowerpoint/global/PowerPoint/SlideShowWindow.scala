package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowWindow")
@js.native
class SlideShowWindow protected ()
  extends typings.activexPowerpoint.PowerPoint.SlideShowWindow {
  /* CompleteClass */
  override val Active: MsoTriState = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  override val IsFullScreen: MsoTriState = js.native
  /* CompleteClass */
  override var Left: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.SlideShowWindow_typekey")
  override var PowerPointDotSlideShowWindow_typekey: typings.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
  /* CompleteClass */
  override val Presentation: typings.activexPowerpoint.PowerPoint.Presentation = js.native
  /* CompleteClass */
  override var Top: Double = js.native
  /* CompleteClass */
  override val View: typings.activexPowerpoint.PowerPoint.SlideShowView = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override def Activate(): Unit = js.native
}

