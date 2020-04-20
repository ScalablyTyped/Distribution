package typings.antd.loadingIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingIconProps extends js.Object {
  var existIcon: Boolean
  var loading: js.UndefOr[Boolean | js.Object] = js.undefined
  var prefixCls: String
}

object LoadingIconProps {
  @scala.inline
  def apply(existIcon: Boolean, prefixCls: String, loading: Boolean | js.Object = null): LoadingIconProps = {
    val __obj = js.Dynamic.literal(existIcon = existIcon.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingIconProps]
  }
}

