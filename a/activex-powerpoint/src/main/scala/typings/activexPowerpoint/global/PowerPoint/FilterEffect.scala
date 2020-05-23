package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimFilterEffectSubtype
import typings.activexPowerpoint.PowerPoint.MsoAnimFilterEffectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.FilterEffect")
@js.native
class FilterEffect protected ()
  extends typings.activexPowerpoint.PowerPoint.FilterEffect {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.FilterEffect_typekey")
  override var PowerPointDotFilterEffect_typekey: typings.activexPowerpoint.PowerPoint.FilterEffect = js.native
  /* CompleteClass */
  override var Reveal: MsoTriState = js.native
  /* CompleteClass */
  override var Subtype: MsoAnimFilterEffectSubtype = js.native
  /* CompleteClass */
  override var Type: MsoAnimFilterEffectType = js.native
}

