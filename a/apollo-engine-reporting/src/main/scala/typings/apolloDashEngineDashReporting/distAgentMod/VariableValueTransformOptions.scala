package typings.apolloDashEngineDashReporting.distAgentMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableValueTransformOptions extends js.Object {
  var operationString: js.UndefOr[String] = js.undefined
  var variables: Record[String, _]
}

object VariableValueTransformOptions {
  @scala.inline
  def apply(variables: Record[String, _], operationString: String = null): VariableValueTransformOptions = {
    val __obj = js.Dynamic.literal(variables = variables)
    if (operationString != null) __obj.updateDynamic("operationString")(operationString)
    __obj.asInstanceOf[VariableValueTransformOptions]
  }
}

