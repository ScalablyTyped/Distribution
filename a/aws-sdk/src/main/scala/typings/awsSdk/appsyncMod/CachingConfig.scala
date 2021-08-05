package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachingConfig extends StObject {
  
  /**
    * The caching keys for a resolver that has caching enabled. Valid values are entries from the $context.arguments, $context.source, and $context.identity maps.
    */
  var cachingKeys: js.UndefOr[CachingKeys] = js.undefined
  
  /**
    * The TTL in seconds for a resolver that has caching enabled. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.undefined
}
object CachingConfig {
  
  inline def apply(): CachingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachingConfig]
  }
  
  extension [Self <: CachingConfig](x: Self) {
    
    inline def setCachingKeys(value: CachingKeys): Self = StObject.set(x, "cachingKeys", value.asInstanceOf[js.Any])
    
    inline def setCachingKeysUndefined: Self = StObject.set(x, "cachingKeys", js.undefined)
    
    inline def setCachingKeysVarargs(value: String*): Self = StObject.set(x, "cachingKeys", js.Array(value :_*))
    
    inline def setTtl(value: Long): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
