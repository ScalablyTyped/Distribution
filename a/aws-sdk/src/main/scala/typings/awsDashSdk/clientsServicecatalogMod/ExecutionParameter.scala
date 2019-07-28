package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionParameter extends js.Object {
  var DefaultValues: js.UndefOr[ExecutionParameterValueList] = js.undefined
  var Name: js.UndefOr[ExecutionParameterKey] = js.undefined
  var Type: js.UndefOr[ExecutionParameterType] = js.undefined
}

object ExecutionParameter {
  @scala.inline
  def apply(
    DefaultValues: ExecutionParameterValueList = null,
    Name: ExecutionParameterKey = null,
    Type: ExecutionParameterType = null
  ): ExecutionParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValues != null) __obj.updateDynamic("DefaultValues")(DefaultValues)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ExecutionParameter]
  }
}

