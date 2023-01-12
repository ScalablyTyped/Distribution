package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceStorageConfigsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * A valid storage type.
    */
  var StorageConfigs: js.UndefOr[InstanceStorageConfigs] = js.undefined
}
object ListInstanceStorageConfigsResponse {
  
  inline def apply(): ListInstanceStorageConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceStorageConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstanceStorageConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageConfigs(value: InstanceStorageConfigs): Self = StObject.set(x, "StorageConfigs", value.asInstanceOf[js.Any])
    
    inline def setStorageConfigsUndefined: Self = StObject.set(x, "StorageConfigs", js.undefined)
    
    inline def setStorageConfigsVarargs(value: InstanceStorageConfig*): Self = StObject.set(x, "StorageConfigs", js.Array(value*))
  }
}
