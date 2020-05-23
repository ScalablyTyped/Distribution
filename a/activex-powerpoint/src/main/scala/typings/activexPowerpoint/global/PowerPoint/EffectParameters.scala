package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.EffectParameters")
@js.native
class EffectParameters protected ()
  extends typings.activexPowerpoint.PowerPoint.EffectParameters {
  /* CompleteClass */
  override var Amount: Double = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Color2: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  /* CompleteClass */
  override var Direction: MsoAnimDirection = js.native
  /* CompleteClass */
  override var FontName: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.EffectParameters_typekey")
  override var PowerPointDotEffectParameters_typekey: typings.activexPowerpoint.PowerPoint.EffectParameters = js.native
  /* CompleteClass */
  override var Relative: MsoTriState = js.native
  /* CompleteClass */
  override var Size: Double = js.native
}

