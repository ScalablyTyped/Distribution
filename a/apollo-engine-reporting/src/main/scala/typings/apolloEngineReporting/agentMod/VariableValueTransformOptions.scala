package typings.apolloEngineReporting.agentMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableValueTransformOptions extends js.Object {
  var operationString: js.UndefOr[String] = js.native
  var variables: Record[String, _] = js.native
}

object VariableValueTransformOptions {
  @scala.inline
  def apply(variables: Record[String, _]): VariableValueTransformOptions = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValueTransformOptions]
  }
  @scala.inline
  implicit class VariableValueTransformOptionsOps[Self <: VariableValueTransformOptions] (val x: Self) extends AnyVal {
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
    def setVariables(value: Record[String, _]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationString(value: String): Self = this.set("operationString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationString: Self = this.set("operationString", js.undefined)
  }
  
}

