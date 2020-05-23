package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectParameters extends js.Object {
  var Amount: Double
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Color2: ColorFormat
  var Direction: MsoAnimDirection
  var FontName: String
  val Parent: js.Any
  @JSName("PowerPoint.EffectParameters_typekey")
  var PowerPointDotEffectParameters_typekey: EffectParameters
  var Relative: MsoTriState
  var Size: Double
}

object EffectParameters {
  @scala.inline
  def apply(
    Amount: Double,
    Application: Application,
    Color2: ColorFormat,
    Direction: MsoAnimDirection,
    FontName: String,
    Parent: js.Any,
    PowerPointDotEffectParameters_typekey: EffectParameters,
    Relative: MsoTriState,
    Size: Double
  ): EffectParameters = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Color2 = Color2.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Relative = Relative.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectParameters_typekey")(PowerPointDotEffectParameters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParameters]
  }
}

