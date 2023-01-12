package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetResourceConfigResponse extends StObject {
  
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined
  
  /**
    * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys list. 
    */
  var unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
}
object BatchGetResourceConfigResponse {
  
  inline def apply(): BatchGetResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetResourceConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetResourceConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setBaseConfigurationItems(value: BaseConfigurationItems): Self = StObject.set(x, "baseConfigurationItems", value.asInstanceOf[js.Any])
    
    inline def setBaseConfigurationItemsUndefined: Self = StObject.set(x, "baseConfigurationItems", js.undefined)
    
    inline def setBaseConfigurationItemsVarargs(value: BaseConfigurationItem*): Self = StObject.set(x, "baseConfigurationItems", js.Array(value*))
    
    inline def setUnprocessedResourceKeys(value: ResourceKeys): Self = StObject.set(x, "unprocessedResourceKeys", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedResourceKeysUndefined: Self = StObject.set(x, "unprocessedResourceKeys", js.undefined)
    
    inline def setUnprocessedResourceKeysVarargs(value: ResourceKey*): Self = StObject.set(x, "unprocessedResourceKeys", js.Array(value*))
  }
}
