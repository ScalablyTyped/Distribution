package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.FilterEffect")
@js.native
class FilterEffect protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.FilterEffect_typekey")
  var PowerPointDotFilterEffect_typekey: FilterEffect = js.native
  var Reveal: MsoTriState = js.native
  var Subtype: MsoAnimFilterEffectSubtype = js.native
  var Type: MsoAnimFilterEffectType = js.native
}

