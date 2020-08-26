package typings.antd.loadingIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingIconProps extends js.Object {
  var existIcon: Boolean = js.native
  var loading: js.UndefOr[Boolean | js.Object] = js.native
  var prefixCls: String = js.native
}

object LoadingIconProps {
  @scala.inline
  def apply(existIcon: Boolean, prefixCls: String): LoadingIconProps = {
    val __obj = js.Dynamic.literal(existIcon = existIcon.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingIconProps]
  }
  @scala.inline
  implicit class LoadingIconPropsOps[Self <: LoadingIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExistIcon(value: Boolean): Self = this.set("existIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean | js.Object): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
  }
  
}

