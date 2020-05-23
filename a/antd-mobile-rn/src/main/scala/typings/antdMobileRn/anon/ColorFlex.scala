package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorFlex extends js.Object {
  var color: String
  var flex: Double
  var fontSize: Double
}

object ColorFlex {
  @scala.inline
  def apply(color: String, flex: Double, fontSize: Double): ColorFlex = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFlex]
  }
}

