package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCachePolicyConfigResult extends StObject {
  
  /**
    * The cache policy configuration.
    */
  var CachePolicyConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.CachePolicyConfig] = js.undefined
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetCachePolicyConfigResult {
  
  inline def apply(): GetCachePolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCachePolicyConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCachePolicyConfigResult] (val x: Self) extends AnyVal {
    
    inline def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setCachePolicyConfigUndefined: Self = StObject.set(x, "CachePolicyConfig", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
