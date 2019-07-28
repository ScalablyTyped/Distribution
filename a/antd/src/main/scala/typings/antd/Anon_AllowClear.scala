package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowClear extends js.Object {
  var allowClear: Boolean
  var disabled: Boolean
  var options: js.Array[scala.Nothing]
  var placeholder: String
  var popupPlacement: String
  var transitionName: String
}

object Anon_AllowClear {
  @scala.inline
  def apply(
    allowClear: Boolean,
    disabled: Boolean,
    options: js.Array[scala.Nothing],
    placeholder: String,
    popupPlacement: String,
    transitionName: String
  ): Anon_AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear, disabled = disabled, options = options, placeholder = placeholder, popupPlacement = popupPlacement, transitionName = transitionName)
  
    __obj.asInstanceOf[Anon_AllowClear]
  }
}

