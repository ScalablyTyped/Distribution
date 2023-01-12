package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileCacheRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the cache that you are updating.
    */
  var FileCacheId: typings.awsSdk.clientsFsxMod.FileCacheId
  
  /**
    * The configuration updates for an Amazon File Cache resource.
    */
  var LustreConfiguration: js.UndefOr[UpdateFileCacheLustreConfiguration] = js.undefined
}
object UpdateFileCacheRequest {
  
  inline def apply(FileCacheId: FileCacheId): UpdateFileCacheRequest = {
    val __obj = js.Dynamic.literal(FileCacheId = FileCacheId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileCacheRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFileCacheRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileCacheId(value: FileCacheId): Self = StObject.set(x, "FileCacheId", value.asInstanceOf[js.Any])
    
    inline def setLustreConfiguration(value: UpdateFileCacheLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
  }
}
