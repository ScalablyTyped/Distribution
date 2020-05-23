package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSize extends js.Object {
  var color: String
  var fontSize: Double
  var marginTop: Double
}

object FontSize {
  @scala.inline
  def apply(color: String, fontSize: Double, marginTop: Double): FontSize = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
}

