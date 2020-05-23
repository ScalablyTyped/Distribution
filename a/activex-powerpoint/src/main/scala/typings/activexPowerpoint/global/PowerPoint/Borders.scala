package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpBorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Borders")
@js.native
class Borders protected ()
  extends typings.activexPowerpoint.PowerPoint.Borders {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Borders_typekey")
  override var PowerPointDotBorders_typekey: typings.activexPowerpoint.PowerPoint.Borders = js.native
  /* CompleteClass */
  override def Item(BorderType: PpBorderType): typings.activexPowerpoint.PowerPoint.LineFormat = js.native
}

