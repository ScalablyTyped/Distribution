package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val By: ColorFormat
  val From: ColorFormat
  val Parent: js.Any
  @JSName("PowerPoint.ColorEffect_typekey")
  var PowerPointDotColorEffect_typekey: ColorEffect
  val To: ColorFormat
}

object ColorEffect {
  @scala.inline
  def apply(
    Application: Application,
    By: ColorFormat,
    From: ColorFormat,
    Parent: js.Any,
    PowerPointDotColorEffect_typekey: ColorEffect,
    To: ColorFormat
  ): ColorEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorEffect_typekey")(PowerPointDotColorEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEffect]
  }
}

