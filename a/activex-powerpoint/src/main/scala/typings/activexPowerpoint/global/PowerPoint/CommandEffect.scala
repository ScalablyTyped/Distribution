package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.MsoAnimCommandType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CommandEffect")
@js.native
class CommandEffect protected ()
  extends typings.activexPowerpoint.PowerPoint.CommandEffect {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Command: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.CommandEffect_typekey")
  override var PowerPointDotCommandEffect_typekey: typings.activexPowerpoint.PowerPoint.CommandEffect = js.native
  /* CompleteClass */
  override var Type: MsoAnimCommandType = js.native
  /* CompleteClass */
  override var bookmark: String = js.native
}

