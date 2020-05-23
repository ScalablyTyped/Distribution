package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlowFormat extends js.Object {
  val Application: js.Any
  val Color: ColorFormat
  val Creator: Double
  @JSName("Office.GlowFormat_typekey")
  var OfficeDotGlowFormat_typekey: GlowFormat
  var Radius: Double
  var Transparency: Double
}

object GlowFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: ColorFormat,
    Creator: Double,
    OfficeDotGlowFormat_typekey: GlowFormat,
    Radius: Double,
    Transparency: Double
  ): GlowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.GlowFormat_typekey")(OfficeDotGlowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowFormat]
  }
}

