package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingVertical extends js.Object {
  var backgroundColor: String
  var color: String
  var fontSize: Double
  var paddingHorizontal: Double
  var paddingVertical: Double
}

object PaddingVertical {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    fontSize: Double,
    paddingHorizontal: Double,
    paddingVertical: Double
  ): PaddingVertical = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingVertical]
  }
}

