package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCachePolicyResult extends StObject {
  
  /**
    * A cache policy.
    */
  var CachePolicy: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.CachePolicy] = js.undefined
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object UpdateCachePolicyResult {
  
  inline def apply(): UpdateCachePolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCachePolicyResult]
  }
  
  extension [Self <: UpdateCachePolicyResult](x: Self) {
    
    inline def setCachePolicy(value: CachePolicy): Self = StObject.set(x, "CachePolicy", value.asInstanceOf[js.Any])
    
    inline def setCachePolicyUndefined: Self = StObject.set(x, "CachePolicy", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
