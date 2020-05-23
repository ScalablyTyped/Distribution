package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var By: Double
  var From: Double
  val Parent: js.Any
  @JSName("PowerPoint.RotationEffect_typekey")
  var PowerPointDotRotationEffect_typekey: RotationEffect
  var To: Double
}

object RotationEffect {
  @scala.inline
  def apply(
    Application: Application,
    By: Double,
    From: Double,
    Parent: js.Any,
    PowerPointDotRotationEffect_typekey: RotationEffect,
    To: Double
  ): RotationEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RotationEffect_typekey")(PowerPointDotRotationEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationEffect]
  }
}

