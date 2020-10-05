package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowClear extends js.Object {
  var allowClear: Boolean = js.native
  var bordered: Boolean = js.native
  var disabled: Boolean = js.native
  var options: js.Array[scala.Nothing] = js.native
  var transitionName: String = js.native
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
  @scala.inline
  implicit class AllowClearOps[Self <: AllowClear] (val x: Self) extends AnyVal {
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsVarargs(value: scala.Nothing*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[scala.Nothing]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
  }
  
}

