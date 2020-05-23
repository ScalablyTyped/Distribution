package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpMouseActivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ActionSettings")
@js.native
class ActionSettings protected ()
  extends typings.activexPowerpoint.PowerPoint.ActionSettings {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ActionSettings_typekey")
  override var PowerPointDotActionSettings_typekey: typings.activexPowerpoint.PowerPoint.ActionSettings = js.native
  /* CompleteClass */
  override def Item(Index: PpMouseActivation): typings.activexPowerpoint.PowerPoint.ActionSetting = js.native
}

