package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachingConfig extends StObject {
  
  /**
    * The caching keys for a resolver that has caching activated. Valid values are entries from the $context.arguments, $context.source, and $context.identity maps.
    */
  var cachingKeys: js.UndefOr[CachingKeys] = js.undefined
  
  /**
    * The TTL in seconds for a resolver that has caching activated. Valid values are 1–3,600 seconds.
    */
  var ttl: Long
}
object CachingConfig {
  
  inline def apply(ttl: Long): CachingConfig = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachingConfig]
  }
  
  extension [Self <: CachingConfig](x: Self) {
    
    inline def setCachingKeys(value: CachingKeys): Self = StObject.set(x, "cachingKeys", value.asInstanceOf[js.Any])
    
    inline def setCachingKeysUndefined: Self = StObject.set(x, "cachingKeys", js.undefined)
    
    inline def setCachingKeysVarargs(value: String*): Self = StObject.set(x, "cachingKeys", js.Array(value*))
    
    inline def setTtl(value: Long): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
