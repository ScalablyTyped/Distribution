package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARGBColor extends js.Object {
  /**
    * Alpha component.
    *
    * Valid range is [0,1.0], with 0.0 denoting fully transparent, and 1.0 fully opaque.
    */
  var Alpha: ColorComponent
  var Blue: ColorComponent
  var Green: ColorComponent
  var Red: ColorComponent
}

object ARGBColor {
  @scala.inline
  def apply(Alpha: ColorComponent, Blue: ColorComponent, Green: ColorComponent, Red: ColorComponent): ARGBColor = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARGBColor]
  }
}

