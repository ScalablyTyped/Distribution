package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileCacheResponse extends StObject {
  
  /**
    * A description of the cache that was updated.
    */
  var FileCache: js.UndefOr[typings.awsSdk.clientsFsxMod.FileCache] = js.undefined
}
object UpdateFileCacheResponse {
  
  inline def apply(): UpdateFileCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileCacheResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFileCacheResponse] (val x: Self) extends AnyVal {
    
    inline def setFileCache(value: FileCache): Self = StObject.set(x, "FileCache", value.asInstanceOf[js.Any])
    
    inline def setFileCacheUndefined: Self = StObject.set(x, "FileCache", js.undefined)
  }
}
