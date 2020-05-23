package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var ByX: Double
  var ByY: Double
  var FromX: Double
  var FromY: Double
  val Parent: js.Any
  var Path: String
  @JSName("PowerPoint.MotionEffect_typekey")
  var PowerPointDotMotionEffect_typekey: MotionEffect
  var ToX: Double
  var ToY: Double
}

object MotionEffect {
  @scala.inline
  def apply(
    Application: Application,
    ByX: Double,
    ByY: Double,
    FromX: Double,
    FromY: Double,
    Parent: js.Any,
    Path: String,
    PowerPointDotMotionEffect_typekey: MotionEffect,
    ToX: Double,
    ToY: Double
  ): MotionEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ByX = ByX.asInstanceOf[js.Any], ByY = ByY.asInstanceOf[js.Any], FromX = FromX.asInstanceOf[js.Any], FromY = FromY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ToX = ToX.asInstanceOf[js.Any], ToY = ToY.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.MotionEffect_typekey")(PowerPointDotMotionEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionEffect]
  }
}

