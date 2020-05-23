package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Parent: js.Any
  @JSName("PowerPoint.FilterEffect_typekey")
  var PowerPointDotFilterEffect_typekey: FilterEffect
  var Reveal: MsoTriState
  var Subtype: MsoAnimFilterEffectSubtype
  var Type: MsoAnimFilterEffectType
}

object FilterEffect {
  @scala.inline
  def apply(
    Application: Application,
    Parent: js.Any,
    PowerPointDotFilterEffect_typekey: FilterEffect,
    Reveal: MsoTriState,
    Subtype: MsoAnimFilterEffectSubtype,
    Type: MsoAnimFilterEffectType
  ): FilterEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reveal = Reveal.asInstanceOf[js.Any], Subtype = Subtype.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.FilterEffect_typekey")(PowerPointDotFilterEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEffect]
  }
}

