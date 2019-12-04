package typings.antd

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixClsSuffixIcon extends js.Object {
  var prefixCls: String
  var suffixIcon: ReactNode
}

object Anon_PrefixClsSuffixIcon {
  @scala.inline
  def apply(prefixCls: String, suffixIcon: ReactNode = null): Anon_PrefixClsSuffixIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrefixClsSuffixIcon]
  }
}

