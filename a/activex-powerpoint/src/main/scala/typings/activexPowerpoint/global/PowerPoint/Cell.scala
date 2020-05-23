package typings.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Cell")
@js.native
class Cell protected ()
  extends typings.activexPowerpoint.PowerPoint.Cell {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Cell_typekey")
  override var PowerPointDotCell_typekey: typings.activexPowerpoint.PowerPoint.Cell = js.native
  /* CompleteClass */
  override val Selected: Boolean = js.native
  /* CompleteClass */
  override val Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  /* CompleteClass */
  override def Merge(MergeTo: typings.activexPowerpoint.PowerPoint.Cell): Unit = js.native
  /* CompleteClass */
  override def Select(): Unit = js.native
  /* CompleteClass */
  override def Split(NumRows: Double, NumColumns: Double): Unit = js.native
}

