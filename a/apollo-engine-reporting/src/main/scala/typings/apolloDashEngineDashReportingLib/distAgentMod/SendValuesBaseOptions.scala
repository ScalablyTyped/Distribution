package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendValuesBaseOptions extends VariableValueOptions {
  var all: js.UndefOr[apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibNumbers.`true`] = js.undefined
  var exceptNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var none: js.UndefOr[apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibNumbers.`true`] = js.undefined
  var onlyNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SendValuesBaseOptions {
  @scala.inline
  def apply(
    all: apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibNumbers.`true` = null,
    exceptNames: js.Array[java.lang.String] = null,
    none: apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibNumbers.`true` = null,
    onlyNames: js.Array[java.lang.String] = null
  ): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (exceptNames != null) __obj.updateDynamic("exceptNames")(exceptNames)
    if (none != null) __obj.updateDynamic("none")(none)
    if (onlyNames != null) __obj.updateDynamic("onlyNames")(onlyNames)
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
}

