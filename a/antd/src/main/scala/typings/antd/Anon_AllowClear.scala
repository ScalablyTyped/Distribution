package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClear extends js.Object {
  var allowClear: Boolean
  var disabled: Boolean
  var options: js.Array[scala.Nothing]
  var popupPlacement: String
  var transitionName: String
}

object Anon_AllowClear {
  @scala.inline
  def apply(
    allowClear: Boolean,
    disabled: Boolean,
    options: js.Array[scala.Nothing],
    popupPlacement: String,
    transitionName: String
  ): Anon_AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], popupPlacement = popupPlacement.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllowClear]
  }
}

