package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBColor extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Parent: js.Any
  @JSName("PowerPoint.RGBColor_typekey")
  var PowerPointDotRGBColor_typekey: RGBColor
  var RGB: MsoRGBType
}

object RGBColor {
  @scala.inline
  def apply(Application: Application, Parent: js.Any, PowerPointDotRGBColor_typekey: RGBColor, RGB: MsoRGBType): RGBColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RGBColor_typekey")(PowerPointDotRGBColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

