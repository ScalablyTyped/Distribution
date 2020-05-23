package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorHandlingConfig extends js.Object {
  /**
    * The max depth for stringifying objects.
    * Setting to a non-positive or non-numeric value, removes the max depth limit
    * @default 5
    */
  var objectMaxDepth: js.UndefOr[Double] = js.undefined
  /**
    * Specifies whether the generated error url will contain the parameters of the thrown error.
    * Disabling the parameters can be useful if the generated error url is very long.
    * @default true;
    */
  var urlErrorParamsEnabled: js.UndefOr[Boolean] = js.undefined
}

object IErrorHandlingConfig {
  @scala.inline
  def apply(
    objectMaxDepth: js.UndefOr[Double] = js.undefined,
    urlErrorParamsEnabled: js.UndefOr[Boolean] = js.undefined
  ): IErrorHandlingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(objectMaxDepth)) __obj.updateDynamic("objectMaxDepth")(objectMaxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(urlErrorParamsEnabled)) __obj.updateDynamic("urlErrorParamsEnabled")(urlErrorParamsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorHandlingConfig]
  }
}

