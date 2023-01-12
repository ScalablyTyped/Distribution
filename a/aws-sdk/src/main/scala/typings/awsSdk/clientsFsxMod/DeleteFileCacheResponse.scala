package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileCacheResponse extends StObject {
  
  /**
    * The ID of the cache that's being deleted.
    */
  var FileCacheId: js.UndefOr[typings.awsSdk.clientsFsxMod.FileCacheId] = js.undefined
  
  /**
    * The cache lifecycle for the deletion request. If the DeleteFileCache operation is successful, this status is DELETING.
    */
  var Lifecycle: js.UndefOr[FileCacheLifecycle] = js.undefined
}
object DeleteFileCacheResponse {
  
  inline def apply(): DeleteFileCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileCacheResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileCacheResponse] (val x: Self) extends AnyVal {
    
    inline def setFileCacheId(value: FileCacheId): Self = StObject.set(x, "FileCacheId", value.asInstanceOf[js.Any])
    
    inline def setFileCacheIdUndefined: Self = StObject.set(x, "FileCacheId", js.undefined)
    
    inline def setLifecycle(value: FileCacheLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
