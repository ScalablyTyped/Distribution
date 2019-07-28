package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

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
    val __obj = js.Dynamic.literal(Blue = Blue, Green = Green, Red = Red)
  
    __obj.asInstanceOf[RGBColor]
  }
}

