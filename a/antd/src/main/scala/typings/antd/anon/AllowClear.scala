package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowClear extends js.Object {
  var allowClear: Boolean
  var bordered: Boolean
  var disabled: Boolean
  var options: js.Array[scala.Nothing]
  var transitionName: String
}

object AllowClear {
  @scala.inline
  def apply(
    allowClear: Boolean,
    bordered: Boolean,
    disabled: Boolean,
    options: js.Array[scala.Nothing],
    transitionName: String
  ): AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowClear]
  }
}

