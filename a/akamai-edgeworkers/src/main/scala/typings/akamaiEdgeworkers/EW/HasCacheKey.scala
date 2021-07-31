package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasCacheKey extends StObject {
  
  /**
    * An object for manipulating this requests cache key. Only present during `onClientRequest()`.
    */
  val cacheKey: CacheKey
}
object HasCacheKey {
  
  @scala.inline
  def apply(cacheKey: CacheKey): HasCacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasCacheKey]
  }
  
  @scala.inline
  implicit class HasCacheKeyMutableBuilder[Self <: HasCacheKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheKey(value: CacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
  }
}
