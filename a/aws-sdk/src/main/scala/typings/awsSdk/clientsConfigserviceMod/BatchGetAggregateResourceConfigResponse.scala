package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAggregateResourceConfigResponse extends StObject {
  
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var BaseConfigurationItems: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.BaseConfigurationItems] = js.undefined
  
  /**
    * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources are processed.
    */
  var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.undefined
}
object BatchGetAggregateResourceConfigResponse {
  
  inline def apply(): BatchGetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
  }
  
  extension [Self <: BatchGetAggregateResourceConfigResponse](x: Self) {
    
    inline def setBaseConfigurationItems(value: BaseConfigurationItems): Self = StObject.set(x, "BaseConfigurationItems", value.asInstanceOf[js.Any])
    
    inline def setBaseConfigurationItemsUndefined: Self = StObject.set(x, "BaseConfigurationItems", js.undefined)
    
    inline def setBaseConfigurationItemsVarargs(value: BaseConfigurationItem*): Self = StObject.set(x, "BaseConfigurationItems", js.Array(value*))
    
    inline def setUnprocessedResourceIdentifiers(value: UnprocessedResourceIdentifierList): Self = StObject.set(x, "UnprocessedResourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedResourceIdentifiersUndefined: Self = StObject.set(x, "UnprocessedResourceIdentifiers", js.undefined)
    
    inline def setUnprocessedResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = StObject.set(x, "UnprocessedResourceIdentifiers", js.Array(value*))
  }
}
