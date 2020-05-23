package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  var backgroundColor: String
  var borderRadius: Double
  var padding: Double
}

object Padding {
  @scala.inline
  def apply(backgroundColor: String, borderRadius: Double, padding: Double): Padding = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
}

