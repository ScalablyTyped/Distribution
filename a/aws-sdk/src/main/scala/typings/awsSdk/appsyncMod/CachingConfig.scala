package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachingConfig extends StObject {
  
  /**
    * The caching keys for a resolver that has caching enabled. Valid values are entries from the $context.arguments, $context.source, and $context.identity maps.
    */
  var cachingKeys: js.UndefOr[CachingKeys] = js.native
  
  /**
    * The TTL in seconds for a resolver that has caching enabled. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.native
}
object CachingConfig {
  
  @scala.inline
  def apply(): CachingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachingConfig]
  }
  
  @scala.inline
  implicit class CachingConfigMutableBuilder[Self <: CachingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachingKeys(value: CachingKeys): Self = StObject.set(x, "cachingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachingKeysUndefined: Self = StObject.set(x, "cachingKeys", js.undefined)
    
    @scala.inline
    def setCachingKeysVarargs(value: String*): Self = StObject.set(x, "cachingKeys", js.Array(value :_*))
    
    @scala.inline
    def setTtl(value: Long): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
