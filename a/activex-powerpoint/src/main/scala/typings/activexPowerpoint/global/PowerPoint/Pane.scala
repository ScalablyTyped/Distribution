package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Pane")
@js.native
class Pane protected ()
  extends typings.activexPowerpoint.PowerPoint.Pane {
  /* CompleteClass */
  override val Active: MsoTriState = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Pane_typekey")
  override var PowerPointDotPane_typekey: typings.activexPowerpoint.PowerPoint.Pane = js.native
  /* CompleteClass */
  override val ViewType: PpViewType = js.native
  /* CompleteClass */
  override def Activate(): Unit = js.native
}

