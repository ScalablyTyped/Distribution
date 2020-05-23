package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var fontSize: Double
  var marginLeft: Double
}

object Color {
  @scala.inline
  def apply(color: String, fontSize: Double, marginLeft: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

