package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefixClsSuffixIcon extends js.Object {
  var prefixCls: String
  var suffixIcon: ReactNode
}

object AnonPrefixClsSuffixIcon {
  @scala.inline
  def apply(prefixCls: String, suffixIcon: ReactNode = null): AnonPrefixClsSuffixIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefixClsSuffixIcon]
  }
}

