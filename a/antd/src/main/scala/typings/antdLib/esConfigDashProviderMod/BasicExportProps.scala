package typings
package antdLib.esConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicExportProps extends js.Object {
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object BasicExportProps {
  @scala.inline
  def apply(prefixCls: java.lang.String = null): BasicExportProps = {
    val __obj = js.Dynamic.literal()
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[BasicExportProps]
  }
}

