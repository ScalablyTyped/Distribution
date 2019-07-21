package typings
package apolloDashServerDashTypesLib.apolloDashServerDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestMetrics extends js.Object {
  var captureTraces: js.UndefOr[scala.Boolean] = js.undefined
  var forbiddenOperation: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var queryPlanTrace: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TraceNs.QueryPlanNode
  ] = js.undefined
  var registeredOperation: js.UndefOr[scala.Boolean] = js.undefined
  var responseCacheHit: js.UndefOr[scala.Boolean] = js.undefined
  var startHrTime: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object GraphQLRequestMetrics {
  @scala.inline
  def apply(
    captureTraces: js.UndefOr[scala.Boolean] = js.undefined,
    forbiddenOperation: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    queryPlanTrace: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TraceNs.QueryPlanNode = null,
    registeredOperation: js.UndefOr[scala.Boolean] = js.undefined,
    responseCacheHit: js.UndefOr[scala.Boolean] = js.undefined,
    startHrTime: js.Tuple2[scala.Double, scala.Double] = null
  ): GraphQLRequestMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureTraces)) __obj.updateDynamic("captureTraces")(captureTraces)
    if (!js.isUndefined(forbiddenOperation)) __obj.updateDynamic("forbiddenOperation")(forbiddenOperation)
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (queryPlanTrace != null) __obj.updateDynamic("queryPlanTrace")(queryPlanTrace)
    if (!js.isUndefined(registeredOperation)) __obj.updateDynamic("registeredOperation")(registeredOperation)
    if (!js.isUndefined(responseCacheHit)) __obj.updateDynamic("responseCacheHit")(responseCacheHit)
    if (startHrTime != null) __obj.updateDynamic("startHrTime")(startHrTime)
    __obj.asInstanceOf[GraphQLRequestMetrics]
  }
}

