package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheCluster] = js.undefined
}
object CreateCacheClusterResult {
  
  inline def apply(): CreateCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheClusterResult]
  }
  
  extension [Self <: CreateCacheClusterResult](x: Self) {
    
    inline def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
