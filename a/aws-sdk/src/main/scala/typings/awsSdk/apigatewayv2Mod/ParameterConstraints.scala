package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterConstraints extends js.Object {
  /**
    * Whether or not the parameter is required.
    */
  var Required: js.UndefOr[boolean] = js.native
}

object ParameterConstraints {
  @scala.inline
  def apply(Required: js.UndefOr[boolean] = js.undefined): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Required)) __obj.updateDynamic("Required")(Required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterConstraints]
  }
}

