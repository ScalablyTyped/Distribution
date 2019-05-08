package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestMetrics extends js.Object {
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var responseCacheHit: js.UndefOr[scala.Boolean] = js.undefined
}

object GraphQLRequestMetrics {
  @scala.inline
  def apply(
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    responseCacheHit: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphQLRequestMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (!js.isUndefined(responseCacheHit)) __obj.updateDynamic("responseCacheHit")(responseCacheHit)
    __obj.asInstanceOf[GraphQLRequestMetrics]
  }
}

