package typings.antd.anon

import typings.antd.buttonButtonMod.LegacyButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmLoading extends js.Object {
  var confirmLoading: Boolean
  var maskTransitionName: String
  var okType: LegacyButtonType
  var transitionName: String
  var visible: Boolean
  var width: Double
}

object ConfirmLoading {
  @scala.inline
  def apply(
    confirmLoading: Boolean,
    maskTransitionName: String,
    okType: LegacyButtonType,
    transitionName: String,
    visible: Boolean,
    width: Double
  ): ConfirmLoading = {
    val __obj = js.Dynamic.literal(confirmLoading = confirmLoading.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], okType = okType.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmLoading]
  }
}

