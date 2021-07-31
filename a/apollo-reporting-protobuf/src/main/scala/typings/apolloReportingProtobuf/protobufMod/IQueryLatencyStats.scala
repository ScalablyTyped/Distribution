package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueryLatencyStats extends StObject {
  
  /** QueryLatencyStats cacheHits */
  var cacheHits: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** QueryLatencyStats forbiddenOperationCount */
  var forbiddenOperationCount: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** QueryLatencyStats persistedQueryHits */
  var persistedQueryHits: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats persistedQueryMisses */
  var persistedQueryMisses: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** QueryLatencyStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** QueryLatencyStats registeredOperationCount */
  var registeredOperationCount: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats requestCount */
  var requestCount: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /** QueryLatencyStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | Null] = js.undefined
}
object IQueryLatencyStats {
  
  @scala.inline
  def apply(): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryLatencyStats]
  }
  
  @scala.inline
  implicit class IQueryLatencyStatsMutableBuilder[Self <: IQueryLatencyStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheHits(value: Double): Self = StObject.set(x, "cacheHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHitsNull: Self = StObject.set(x, "cacheHits", null)
    
    @scala.inline
    def setCacheHitsUndefined: Self = StObject.set(x, "cacheHits", js.undefined)
    
    @scala.inline
    def setCacheLatencyCount(value: js.Array[Double]): Self = StObject.set(x, "cacheLatencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheLatencyCountNull: Self = StObject.set(x, "cacheLatencyCount", null)
    
    @scala.inline
    def setCacheLatencyCountUndefined: Self = StObject.set(x, "cacheLatencyCount", js.undefined)
    
    @scala.inline
    def setCacheLatencyCountVarargs(value: Double*): Self = StObject.set(x, "cacheLatencyCount", js.Array(value :_*))
    
    @scala.inline
    def setForbiddenOperationCount(value: Double): Self = StObject.set(x, "forbiddenOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenOperationCountNull: Self = StObject.set(x, "forbiddenOperationCount", null)
    
    @scala.inline
    def setForbiddenOperationCountUndefined: Self = StObject.set(x, "forbiddenOperationCount", js.undefined)
    
    @scala.inline
    def setLatencyCount(value: js.Array[Double]): Self = StObject.set(x, "latencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyCountNull: Self = StObject.set(x, "latencyCount", null)
    
    @scala.inline
    def setLatencyCountUndefined: Self = StObject.set(x, "latencyCount", js.undefined)
    
    @scala.inline
    def setLatencyCountVarargs(value: Double*): Self = StObject.set(x, "latencyCount", js.Array(value :_*))
    
    @scala.inline
    def setPersistedQueryHits(value: Double): Self = StObject.set(x, "persistedQueryHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistedQueryHitsNull: Self = StObject.set(x, "persistedQueryHits", null)
    
    @scala.inline
    def setPersistedQueryHitsUndefined: Self = StObject.set(x, "persistedQueryHits", js.undefined)
    
    @scala.inline
    def setPersistedQueryMisses(value: Double): Self = StObject.set(x, "persistedQueryMisses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistedQueryMissesNull: Self = StObject.set(x, "persistedQueryMisses", null)
    
    @scala.inline
    def setPersistedQueryMissesUndefined: Self = StObject.set(x, "persistedQueryMisses", js.undefined)
    
    @scala.inline
    def setPrivateCacheTtlCount(value: js.Array[Double]): Self = StObject.set(x, "privateCacheTtlCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateCacheTtlCountNull: Self = StObject.set(x, "privateCacheTtlCount", null)
    
    @scala.inline
    def setPrivateCacheTtlCountUndefined: Self = StObject.set(x, "privateCacheTtlCount", js.undefined)
    
    @scala.inline
    def setPrivateCacheTtlCountVarargs(value: Double*): Self = StObject.set(x, "privateCacheTtlCount", js.Array(value :_*))
    
    @scala.inline
    def setPublicCacheTtlCount(value: js.Array[Double]): Self = StObject.set(x, "publicCacheTtlCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicCacheTtlCountNull: Self = StObject.set(x, "publicCacheTtlCount", null)
    
    @scala.inline
    def setPublicCacheTtlCountUndefined: Self = StObject.set(x, "publicCacheTtlCount", js.undefined)
    
    @scala.inline
    def setPublicCacheTtlCountVarargs(value: Double*): Self = StObject.set(x, "publicCacheTtlCount", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredOperationCount(value: Double): Self = StObject.set(x, "registeredOperationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredOperationCountNull: Self = StObject.set(x, "registeredOperationCount", null)
    
    @scala.inline
    def setRegisteredOperationCountUndefined: Self = StObject.set(x, "registeredOperationCount", js.undefined)
    
    @scala.inline
    def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCountNull: Self = StObject.set(x, "requestCount", null)
    
    @scala.inline
    def setRequestCountUndefined: Self = StObject.set(x, "requestCount", js.undefined)
    
    @scala.inline
    def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    @scala.inline
    def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
    
    @scala.inline
    def setRootErrorStats(value: IPathErrorStats): Self = StObject.set(x, "rootErrorStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootErrorStatsNull: Self = StObject.set(x, "rootErrorStats", null)
    
    @scala.inline
    def setRootErrorStatsUndefined: Self = StObject.set(x, "rootErrorStats", js.undefined)
  }
}
