package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixCls extends js.Object {
  var prefixCls: String = js.native
}

object PrefixCls {
  @scala.inline
  def apply(prefixCls: String): PrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixCls]
  }
  @scala.inline
  implicit class PrefixClsOps[Self <: PrefixCls] (val x: Self) extends AnyVal {
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

