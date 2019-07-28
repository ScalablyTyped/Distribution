package typings.antd.esConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicExportProps extends js.Object {
  var prefixCls: js.UndefOr[String] = js.undefined
}

object BasicExportProps {
  @scala.inline
  def apply(prefixCls: String = null): BasicExportProps = {
    val __obj = js.Dynamic.literal()
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[BasicExportProps]
  }
}

