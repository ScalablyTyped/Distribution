package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAggregateResourceConfigRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  
  /**
    * A list of aggregate ResourceIdentifiers objects. 
    */
  var ResourceIdentifiers: ResourceIdentifiersList
}
object BatchGetAggregateResourceConfigRequest {
  
  inline def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifiers: ResourceIdentifiersList
  ): BatchGetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifiers = ResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAggregateResourceConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetAggregateResourceConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifiers(value: ResourceIdentifiersList): Self = StObject.set(x, "ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifiersVarargs(value: AggregateResourceIdentifier*): Self = StObject.set(x, "ResourceIdentifiers", js.Array(value*))
  }
}
