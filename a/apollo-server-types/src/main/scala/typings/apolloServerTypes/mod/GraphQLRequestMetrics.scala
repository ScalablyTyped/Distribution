package typings.apolloServerTypes.mod

import typings.apolloEngineReportingProtobuf.mod.Trace.QueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestMetrics extends js.Object {
  var captureTraces: js.UndefOr[Boolean] = js.undefined
  var forbiddenOperation: js.UndefOr[Boolean] = js.undefined
  var persistedQueryHit: js.UndefOr[Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[Boolean] = js.undefined
  var queryPlanTrace: js.UndefOr[QueryPlanNode] = js.undefined
  var registeredOperation: js.UndefOr[Boolean] = js.undefined
  var responseCacheHit: js.UndefOr[Boolean] = js.undefined
  var startHrTime: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object GraphQLRequestMetrics {
  @scala.inline
  def apply(
    captureTraces: js.UndefOr[Boolean] = js.undefined,
    forbiddenOperation: js.UndefOr[Boolean] = js.undefined,
    persistedQueryHit: js.UndefOr[Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[Boolean] = js.undefined,
    queryPlanTrace: QueryPlanNode = null,
    registeredOperation: js.UndefOr[Boolean] = js.undefined,
    responseCacheHit: js.UndefOr[Boolean] = js.undefined,
    startHrTime: js.Tuple2[Double, Double] = null
  ): GraphQLRequestMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureTraces)) __obj.updateDynamic("captureTraces")(captureTraces.asInstanceOf[js.Any])
    if (!js.isUndefined(forbiddenOperation)) __obj.updateDynamic("forbiddenOperation")(forbiddenOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister.asInstanceOf[js.Any])
    if (queryPlanTrace != null) __obj.updateDynamic("queryPlanTrace")(queryPlanTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(registeredOperation)) __obj.updateDynamic("registeredOperation")(registeredOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCacheHit)) __obj.updateDynamic("responseCacheHit")(responseCacheHit.asInstanceOf[js.Any])
    if (startHrTime != null) __obj.updateDynamic("startHrTime")(startHrTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestMetrics]
  }
}

