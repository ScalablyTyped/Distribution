package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageSystemsResponse extends StObject {
  
  /**
    * The opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
  
  /**
    * The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync Discovery.
    */
  var StorageSystems: js.UndefOr[StorageSystemList] = js.undefined
}
object ListStorageSystemsResponse {
  
  inline def apply(): ListStorageSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStorageSystemsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStorageSystemsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageSystems(value: StorageSystemList): Self = StObject.set(x, "StorageSystems", value.asInstanceOf[js.Any])
    
    inline def setStorageSystemsUndefined: Self = StObject.set(x, "StorageSystems", js.undefined)
    
    inline def setStorageSystemsVarargs(value: StorageSystemListEntry*): Self = StObject.set(x, "StorageSystems", js.Array(value*))
  }
}
