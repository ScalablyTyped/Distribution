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
  
  inline def apply(): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryLatencyStats]
  }
  
  extension [Self <: IQueryLatencyStats](x: Self) {
    
    inline def setCacheHits(value: Double): Self = StObject.set(x, "cacheHits", value.asInstanceOf[js.Any])
    
    inline def setCacheHitsNull: Self = StObject.set(x, "cacheHits", null)
    
    inline def setCacheHitsUndefined: Self = StObject.set(x, "cacheHits", js.undefined)
    
    inline def setCacheLatencyCount(value: js.Array[Double]): Self = StObject.set(x, "cacheLatencyCount", value.asInstanceOf[js.Any])
    
    inline def setCacheLatencyCountNull: Self = StObject.set(x, "cacheLatencyCount", null)
    
    inline def setCacheLatencyCountUndefined: Self = StObject.set(x, "cacheLatencyCount", js.undefined)
    
    inline def setCacheLatencyCountVarargs(value: Double*): Self = StObject.set(x, "cacheLatencyCount", js.Array(value :_*))
    
    inline def setForbiddenOperationCount(value: Double): Self = StObject.set(x, "forbiddenOperationCount", value.asInstanceOf[js.Any])
    
    inline def setForbiddenOperationCountNull: Self = StObject.set(x, "forbiddenOperationCount", null)
    
    inline def setForbiddenOperationCountUndefined: Self = StObject.set(x, "forbiddenOperationCount", js.undefined)
    
    inline def setLatencyCount(value: js.Array[Double]): Self = StObject.set(x, "latencyCount", value.asInstanceOf[js.Any])
    
    inline def setLatencyCountNull: Self = StObject.set(x, "latencyCount", null)
    
    inline def setLatencyCountUndefined: Self = StObject.set(x, "latencyCount", js.undefined)
    
    inline def setLatencyCountVarargs(value: Double*): Self = StObject.set(x, "latencyCount", js.Array(value :_*))
    
    inline def setPersistedQueryHits(value: Double): Self = StObject.set(x, "persistedQueryHits", value.asInstanceOf[js.Any])
    
    inline def setPersistedQueryHitsNull: Self = StObject.set(x, "persistedQueryHits", null)
    
    inline def setPersistedQueryHitsUndefined: Self = StObject.set(x, "persistedQueryHits", js.undefined)
    
    inline def setPersistedQueryMisses(value: Double): Self = StObject.set(x, "persistedQueryMisses", value.asInstanceOf[js.Any])
    
    inline def setPersistedQueryMissesNull: Self = StObject.set(x, "persistedQueryMisses", null)
    
    inline def setPersistedQueryMissesUndefined: Self = StObject.set(x, "persistedQueryMisses", js.undefined)
    
    inline def setPrivateCacheTtlCount(value: js.Array[Double]): Self = StObject.set(x, "privateCacheTtlCount", value.asInstanceOf[js.Any])
    
    inline def setPrivateCacheTtlCountNull: Self = StObject.set(x, "privateCacheTtlCount", null)
    
    inline def setPrivateCacheTtlCountUndefined: Self = StObject.set(x, "privateCacheTtlCount", js.undefined)
    
    inline def setPrivateCacheTtlCountVarargs(value: Double*): Self = StObject.set(x, "privateCacheTtlCount", js.Array(value :_*))
    
    inline def setPublicCacheTtlCount(value: js.Array[Double]): Self = StObject.set(x, "publicCacheTtlCount", value.asInstanceOf[js.Any])
    
    inline def setPublicCacheTtlCountNull: Self = StObject.set(x, "publicCacheTtlCount", null)
    
    inline def setPublicCacheTtlCountUndefined: Self = StObject.set(x, "publicCacheTtlCount", js.undefined)
    
    inline def setPublicCacheTtlCountVarargs(value: Double*): Self = StObject.set(x, "publicCacheTtlCount", js.Array(value :_*))
    
    inline def setRegisteredOperationCount(value: Double): Self = StObject.set(x, "registeredOperationCount", value.asInstanceOf[js.Any])
    
    inline def setRegisteredOperationCountNull: Self = StObject.set(x, "registeredOperationCount", null)
    
    inline def setRegisteredOperationCountUndefined: Self = StObject.set(x, "registeredOperationCount", js.undefined)
    
    inline def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
    
    inline def setRequestCountNull: Self = StObject.set(x, "requestCount", null)
    
    inline def setRequestCountUndefined: Self = StObject.set(x, "requestCount", js.undefined)
    
    inline def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    inline def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    inline def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
    
    inline def setRootErrorStats(value: IPathErrorStats): Self = StObject.set(x, "rootErrorStats", value.asInstanceOf[js.Any])
    
    inline def setRootErrorStatsNull: Self = StObject.set(x, "rootErrorStats", null)
    
    inline def setRootErrorStatsUndefined: Self = StObject.set(x, "rootErrorStats", js.undefined)
  }
}
