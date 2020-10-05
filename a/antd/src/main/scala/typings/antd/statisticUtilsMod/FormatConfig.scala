package typings.antd.statisticUtilsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatConfig extends js.Object {
  var decimalSeparator: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[Formatter] = js.native
  var groupSeparator: js.UndefOr[String] = js.native
  var precision: js.UndefOr[Double] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object FormatConfig {
  @scala.inline
  def apply(): FormatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatConfig]
  }
  @scala.inline
  implicit class FormatConfigOps[Self <: FormatConfig] (val x: Self) extends AnyVal {
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
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setFormatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactNode): Self = this.set("formatter", js.Any.fromFunction2(value))
    @scala.inline
    def setFormatter(value: Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSeparator: Self = this.set("groupSeparator", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

