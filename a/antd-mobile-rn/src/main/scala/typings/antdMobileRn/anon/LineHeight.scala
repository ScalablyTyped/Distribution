package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeight extends js.Object {
  var color: String
  var fontSize: Double
  var fontWeight: String
  var lineHeight: Double
}

object LineHeight {
  @scala.inline
  def apply(color: String, fontSize: Double, fontWeight: String, lineHeight: Double): LineHeight = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

