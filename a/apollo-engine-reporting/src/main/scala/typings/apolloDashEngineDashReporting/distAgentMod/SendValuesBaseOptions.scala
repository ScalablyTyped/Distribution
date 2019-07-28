package typings.apolloDashEngineDashReporting.distAgentMod

import typings.apolloDashEngineDashReporting.apolloDashEngineDashReportingNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendValuesBaseOptions extends VariableValueOptions {
  var all: js.UndefOr[`true`] = js.undefined
  var exceptNames: js.UndefOr[js.Array[String]] = js.undefined
  var none: js.UndefOr[`true`] = js.undefined
  var onlyNames: js.UndefOr[js.Array[String]] = js.undefined
}

object SendValuesBaseOptions {
  @scala.inline
  def apply(
    all: `true` = null,
    exceptNames: js.Array[String] = null,
    none: `true` = null,
    onlyNames: js.Array[String] = null
  ): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (exceptNames != null) __obj.updateDynamic("exceptNames")(exceptNames)
    if (none != null) __obj.updateDynamic("none")(none)
    if (onlyNames != null) __obj.updateDynamic("onlyNames")(onlyNames)
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
}

