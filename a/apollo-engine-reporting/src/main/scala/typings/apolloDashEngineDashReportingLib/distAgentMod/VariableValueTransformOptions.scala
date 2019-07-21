package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableValueTransformOptions extends js.Object {
  var operationString: js.UndefOr[java.lang.String] = js.undefined
  var variables: stdLib.Record[java.lang.String, _]
}

object VariableValueTransformOptions {
  @scala.inline
  def apply(variables: stdLib.Record[java.lang.String, _], operationString: java.lang.String = null): VariableValueTransformOptions = {
    val __obj = js.Dynamic.literal(variables = variables)
    if (operationString != null) __obj.updateDynamic("operationString")(operationString)
    __obj.asInstanceOf[VariableValueTransformOptions]
  }
}

