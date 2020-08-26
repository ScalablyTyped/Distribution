package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectParameters extends js.Object {
  var Amount: Double = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Color2: ColorFormat = js.native
  var Direction: MsoAnimDirection = js.native
  var FontName: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.EffectParameters_typekey")
  var PowerPointDotEffectParameters_typekey: EffectParameters = js.native
  var Relative: MsoTriState = js.native
  var Size: Double = js.native
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
  @scala.inline
  implicit class EffectParametersOps[Self <: EffectParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor2(value: ColorFormat): Self = this.set("Color2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: MsoAnimDirection): Self = this.set("Direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("FontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotEffectParameters_typekey(value: EffectParameters): Self = this.set("PowerPoint.EffectParameters_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: MsoTriState): Self = this.set("Relative", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
  }
  
}

