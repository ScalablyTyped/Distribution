package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var current: Double
  var direction: String
  var iconPrefix: String
  var labelPlacement: String
  var prefixCls: String
}

object AnonDirection {
  @scala.inline
  def apply(current: Double, direction: String, iconPrefix: String, labelPlacement: String, prefixCls: String): AnonDirection = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], labelPlacement = labelPlacement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

