package typings
package antdLib.libStatisticUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatConfig extends js.Object {
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var groupSeparator: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object FormatConfig {
  @scala.inline
  def apply(
    decimalSeparator: java.lang.String = null,
    formatter: Formatter = null,
    groupSeparator: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null
  ): FormatConfig = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[FormatConfig]
  }
}

