package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  val Application: js.Any
  val Color: ColorFormat
  val Creator: Double
  @JSName("Office.GradientStop_typekey")
  var OfficeDotGradientStop_typekey: GradientStop
  var Position: Double
  var Transparency: Double
}

object GradientStop {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: ColorFormat,
    Creator: Double,
    OfficeDotGradientStop_typekey: GradientStop,
    Position: Double,
    Transparency: Double
  ): GradientStop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.GradientStop_typekey")(OfficeDotGradientStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
}

