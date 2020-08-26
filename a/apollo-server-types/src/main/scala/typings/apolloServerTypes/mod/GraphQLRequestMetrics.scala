package typings.apolloServerTypes.mod

import typings.apolloEngineReportingProtobuf.mod.Trace.QueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestMetrics extends js.Object {
  var captureTraces: js.UndefOr[Boolean] = js.native
  var forbiddenOperation: js.UndefOr[Boolean] = js.native
  var persistedQueryHit: js.UndefOr[Boolean] = js.native
  var persistedQueryRegister: js.UndefOr[Boolean] = js.native
  var queryPlanTrace: js.UndefOr[QueryPlanNode] = js.native
  var registeredOperation: js.UndefOr[Boolean] = js.native
  var responseCacheHit: js.UndefOr[Boolean] = js.native
  var startHrTime: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object GraphQLRequestMetrics {
  @scala.inline
  def apply(): GraphQLRequestMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestMetrics]
  }
  @scala.inline
  implicit class GraphQLRequestMetricsOps[Self <: GraphQLRequestMetrics] (val x: Self) extends AnyVal {
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
    def setCaptureTraces(value: Boolean): Self = this.set("captureTraces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureTraces: Self = this.set("captureTraces", js.undefined)
    @scala.inline
    def setForbiddenOperation(value: Boolean): Self = this.set("forbiddenOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbiddenOperation: Self = this.set("forbiddenOperation", js.undefined)
    @scala.inline
    def setPersistedQueryHit(value: Boolean): Self = this.set("persistedQueryHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueryHit: Self = this.set("persistedQueryHit", js.undefined)
    @scala.inline
    def setPersistedQueryRegister(value: Boolean): Self = this.set("persistedQueryRegister", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueryRegister: Self = this.set("persistedQueryRegister", js.undefined)
    @scala.inline
    def setQueryPlanTrace(value: QueryPlanNode): Self = this.set("queryPlanTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryPlanTrace: Self = this.set("queryPlanTrace", js.undefined)
    @scala.inline
    def setRegisteredOperation(value: Boolean): Self = this.set("registeredOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredOperation: Self = this.set("registeredOperation", js.undefined)
    @scala.inline
    def setResponseCacheHit(value: Boolean): Self = this.set("responseCacheHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCacheHit: Self = this.set("responseCacheHit", js.undefined)
    @scala.inline
    def setStartHrTime(value: js.Tuple2[Double, Double]): Self = this.set("startHrTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHrTime: Self = this.set("startHrTime", js.undefined)
  }
  
}

