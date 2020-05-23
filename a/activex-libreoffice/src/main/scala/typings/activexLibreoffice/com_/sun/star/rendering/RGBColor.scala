package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBColor extends js.Object {
  var Blue: ColorComponent
  var Green: ColorComponent
  var Red: ColorComponent
}

object RGBColor {
  @scala.inline
  def apply(Blue: ColorComponent, Green: ColorComponent, Red: ColorComponent): RGBColor = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

