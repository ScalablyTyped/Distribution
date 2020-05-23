package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpTabStopType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TabStop")
@js.native
class TabStop protected ()
  extends typings.activexPowerpoint.PowerPoint.TabStop {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  @JSName("PowerPoint.TabStop_typekey")
  override var PowerPointDotTabStop_typekey: typings.activexPowerpoint.PowerPoint.TabStop = js.native
  /* CompleteClass */
  override var Type: PpTabStopType = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
}

