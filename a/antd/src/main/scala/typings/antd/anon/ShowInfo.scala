package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowInfo extends js.Object {
  var showInfo: Boolean
  var strokeWidth: Double
}

object ShowInfo {
  @scala.inline
  def apply(showInfo: Boolean, strokeWidth: Double): ShowInfo = {
    val __obj = js.Dynamic.literal(showInfo = showInfo.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowInfo]
  }
}

