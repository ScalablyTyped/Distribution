package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheCluster] = js.undefined
}
object RebootCacheClusterResult {
  
  inline def apply(): RebootCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootCacheClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RebootCacheClusterResult] (val x: Self) extends AnyVal {
    
    inline def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
