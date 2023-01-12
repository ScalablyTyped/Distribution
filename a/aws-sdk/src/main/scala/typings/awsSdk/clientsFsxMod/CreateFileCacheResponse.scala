package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileCacheResponse extends StObject {
  
  /**
    * A description of the cache that was created.
    */
  var FileCache: js.UndefOr[FileCacheCreating] = js.undefined
}
object CreateFileCacheResponse {
  
  inline def apply(): CreateFileCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileCacheResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFileCacheResponse] (val x: Self) extends AnyVal {
    
    inline def setFileCache(value: FileCacheCreating): Self = StObject.set(x, "FileCache", value.asInstanceOf[js.Any])
    
    inline def setFileCacheUndefined: Self = StObject.set(x, "FileCache", js.undefined)
  }
}
