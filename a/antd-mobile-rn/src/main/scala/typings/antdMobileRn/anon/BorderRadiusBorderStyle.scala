package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRadiusBorderStyle extends js.Object {
  var borderRadius: Double
  var borderStyle: String
  var borderWidth: Double
  var overflow: String
  var paddingHorizontal: Double
  var paddingVertical: Double
}

object BorderRadiusBorderStyle {
  @scala.inline
  def apply(
    borderRadius: Double,
    borderStyle: String,
    borderWidth: Double,
    overflow: String,
    paddingHorizontal: Double,
    paddingVertical: Double
  ): BorderRadiusBorderStyle = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusBorderStyle]
  }
}

