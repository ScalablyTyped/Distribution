package typings.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PrintRanges")
@js.native
class PrintRanges protected ()
  extends typings.activexPowerpoint.PowerPoint.PrintRanges {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PrintRanges_typekey")
  override var PowerPointDotPrintRanges_typekey: typings.activexPowerpoint.PowerPoint.PrintRanges = js.native
  /* CompleteClass */
  override def Add(Start: Double, End: Double): typings.activexPowerpoint.PowerPoint.PrintRange = js.native
  /* CompleteClass */
  override def ClearAll(): Unit = js.native
  /* CompleteClass */
  override def Item(Index: Double): typings.activexPowerpoint.PowerPoint.PrintRange = js.native
}

