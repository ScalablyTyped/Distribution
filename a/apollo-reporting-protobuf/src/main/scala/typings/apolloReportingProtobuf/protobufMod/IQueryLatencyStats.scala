package typings.apolloReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryLatencyStats extends js.Object {
  
  /** QueryLatencyStats cacheHits */
  var cacheHits: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** QueryLatencyStats forbiddenOperationCount */
  var forbiddenOperationCount: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** QueryLatencyStats persistedQueryHits */
  var persistedQueryHits: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats persistedQueryMisses */
  var persistedQueryMisses: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** QueryLatencyStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** QueryLatencyStats registeredOperationCount */
  var registeredOperationCount: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats requestCount */
  var requestCount: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
  
  /** QueryLatencyStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | Null] = js.native
}
object IQueryLatencyStats {
  
  @scala.inline
  def apply(): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryLatencyStats]
  }
  
  @scala.inline
  implicit class IQueryLatencyStatsOps[Self <: IQueryLatencyStats] (val x: Self) extends AnyVal {
    
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
    def setCacheHits(value: Double): Self = this.set("cacheHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHits: Self = this.set("cacheHits", js.undefined)
    
    @scala.inline
    def setCacheHitsNull: Self = this.set("cacheHits", null)
    
    @scala.inline
    def setCacheLatencyCountVarargs(value: Double*): Self = this.set("cacheLatencyCount", js.Array(value :_*))
    
    @scala.inline
    def setCacheLatencyCount(value: js.Array[Double]): Self = this.set("cacheLatencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLatencyCount: Self = this.set("cacheLatencyCount", js.undefined)
    
    @scala.inline
    def setCacheLatencyCountNull: Self = this.set("cacheLatencyCount", null)
    
    @scala.inline
    def setForbiddenOperationCount(value: Double): Self = this.set("forbiddenOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbiddenOperationCount: Self = this.set("forbiddenOperationCount", js.undefined)
    
    @scala.inline
    def setForbiddenOperationCountNull: Self = this.set("forbiddenOperationCount", null)
    
    @scala.inline
    def setLatencyCountVarargs(value: Double*): Self = this.set("latencyCount", js.Array(value :_*))
    
    @scala.inline
    def setLatencyCount(value: js.Array[Double]): Self = this.set("latencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyCount: Self = this.set("latencyCount", js.undefined)
    
    @scala.inline
    def setLatencyCountNull: Self = this.set("latencyCount", null)
    
    @scala.inline
    def setPersistedQueryHits(value: Double): Self = this.set("persistedQueryHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistedQueryHits: Self = this.set("persistedQueryHits", js.undefined)
    
    @scala.inline
    def setPersistedQueryHitsNull: Self = this.set("persistedQueryHits", null)
    
    @scala.inline
    def setPersistedQueryMisses(value: Double): Self = this.set("persistedQueryMisses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistedQueryMisses: Self = this.set("persistedQueryMisses", js.undefined)
    
    @scala.inline
    def setPersistedQueryMissesNull: Self = this.set("persistedQueryMisses", null)
    
    @scala.inline
    def setPrivateCacheTtlCountVarargs(value: Double*): Self = this.set("privateCacheTtlCount", js.Array(value :_*))
    
    @scala.inline
    def setPrivateCacheTtlCount(value: js.Array[Double]): Self = this.set("privateCacheTtlCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateCacheTtlCount: Self = this.set("privateCacheTtlCount", js.undefined)
    
    @scala.inline
    def setPrivateCacheTtlCountNull: Self = this.set("privateCacheTtlCount", null)
    
    @scala.inline
    def setPublicCacheTtlCountVarargs(value: Double*): Self = this.set("publicCacheTtlCount", js.Array(value :_*))
    
    @scala.inline
    def setPublicCacheTtlCount(value: js.Array[Double]): Self = this.set("publicCacheTtlCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicCacheTtlCount: Self = this.set("publicCacheTtlCount", js.undefined)
    
    @scala.inline
    def setPublicCacheTtlCountNull: Self = this.set("publicCacheTtlCount", null)
    
    @scala.inline
    def setRegisteredOperationCount(value: Double): Self = this.set("registeredOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredOperationCount: Self = this.set("registeredOperationCount", js.undefined)
    
    @scala.inline
    def setRegisteredOperationCountNull: Self = this.set("registeredOperationCount", null)
    
    @scala.inline
    def setRequestCount(value: Double): Self = this.set("requestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCount: Self = this.set("requestCount", js.undefined)
    
    @scala.inline
    def setRequestCountNull: Self = this.set("requestCount", null)
    
    @scala.inline
    def setRequestsWithErrorsCount(value: Double): Self = this.set("requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsWithErrorsCount: Self = this.set("requestsWithErrorsCount", js.undefined)
    
    @scala.inline
    def setRequestsWithErrorsCountNull: Self = this.set("requestsWithErrorsCount", null)
    
    @scala.inline
    def setRootErrorStats(value: IPathErrorStats): Self = this.set("rootErrorStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootErrorStats: Self = this.set("rootErrorStats", js.undefined)
    
    @scala.inline
    def setRootErrorStatsNull: Self = this.set("rootErrorStats", null)
  }
}
