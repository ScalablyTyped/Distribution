package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingTop extends js.Object {
  var backgroundColor: String
  var color: String
  var fontSize: Double
  var paddingBottom: Double
  var paddingHorizontal: Double
  var paddingTop: Double
}

object PaddingTop {
  @scala.inline
  def apply(
    backgroundColor: String,
    color: String,
    fontSize: Double,
    paddingBottom: Double,
    paddingHorizontal: Double,
    paddingTop: Double
  ): PaddingTop = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingTop]
  }
}

