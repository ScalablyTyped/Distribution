package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingBottom extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var borderRadius: Double
  var borderWidth: Double
  var flexDirection: String
  var paddingBottom: Double
}

object PaddingBottom {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    flexDirection: String,
    paddingBottom: Double
  ): PaddingBottom = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottom]
  }
}

