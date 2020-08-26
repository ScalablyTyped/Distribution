package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveStyle extends js.Object {
  var disabled: Boolean = js.native
  var `inline`: Boolean = js.native
  var loading: Boolean = js.native
  var prefixCls: String = js.native
  var size: String = js.native
}

object ActiveStyle {
  @scala.inline
  def apply(disabled: Boolean, `inline`: Boolean, loading: Boolean, prefixCls: String, size: String): ActiveStyle = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveStyle]
  }
  @scala.inline
  implicit class ActiveStyleOps[Self <: ActiveStyle] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

