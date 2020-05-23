package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var ByX: Double
  var ByY: Double
  var FromX: Double
  var FromY: Double
  val Parent: js.Any
  @JSName("PowerPoint.ScaleEffect_typekey")
  var PowerPointDotScaleEffect_typekey: ScaleEffect
  var ToX: Double
  var ToY: Double
}

object ScaleEffect {
  @scala.inline
  def apply(
    Application: Application,
    ByX: Double,
    ByY: Double,
    FromX: Double,
    FromY: Double,
    Parent: js.Any,
    PowerPointDotScaleEffect_typekey: ScaleEffect,
    ToX: Double,
    ToY: Double
  ): ScaleEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ByX = ByX.asInstanceOf[js.Any], ByY = ByY.asInstanceOf[js.Any], FromX = FromX.asInstanceOf[js.Any], FromY = FromY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToX = ToX.asInstanceOf[js.Any], ToY = ToY.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ScaleEffect_typekey")(PowerPointDotScaleEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEffect]
  }
}

