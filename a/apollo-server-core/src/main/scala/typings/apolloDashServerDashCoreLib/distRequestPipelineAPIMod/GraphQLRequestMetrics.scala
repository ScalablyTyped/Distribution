package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestMetrics extends js.Object {
  var forbiddenOperation: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var registeredOperation: js.UndefOr[scala.Boolean] = js.undefined
  var responseCacheHit: js.UndefOr[scala.Boolean] = js.undefined
}

object GraphQLRequestMetrics {
  @scala.inline
  def apply(
    forbiddenOperation: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    registeredOperation: js.UndefOr[scala.Boolean] = js.undefined,
    responseCacheHit: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphQLRequestMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forbiddenOperation)) __obj.updateDynamic("forbiddenOperation")(forbiddenOperation)
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (!js.isUndefined(registeredOperation)) __obj.updateDynamic("registeredOperation")(registeredOperation)
    if (!js.isUndefined(responseCacheHit)) __obj.updateDynamic("responseCacheHit")(responseCacheHit)
    __obj.asInstanceOf[GraphQLRequestMetrics]
  }
}

