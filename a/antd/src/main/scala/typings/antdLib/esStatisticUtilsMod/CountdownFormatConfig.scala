package typings
package antdLib.esStatisticUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountdownFormatConfig extends FormatConfig {
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object CountdownFormatConfig {
  @scala.inline
  def apply(
    decimalSeparator: java.lang.String = null,
    format: java.lang.String = null,
    formatter: Formatter = null,
    groupSeparator: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null
  ): CountdownFormatConfig = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CountdownFormatConfig]
  }
}

