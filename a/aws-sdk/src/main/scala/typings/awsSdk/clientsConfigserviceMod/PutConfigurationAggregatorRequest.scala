package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationAggregatorRequest extends StObject {
  
  /**
    * A list of AccountAggregationSource object. 
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  
  /**
    * An OrganizationAggregationSource object.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationAggregationSource] = js.undefined
  
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
}
object PutConfigurationAggregatorRequest {
  
  inline def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): PutConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationAggregatorRequest]
  }
  
  extension [Self <: PutConfigurationAggregatorRequest](x: Self) {
    
    inline def setAccountAggregationSources(value: AccountAggregationSourceList): Self = StObject.set(x, "AccountAggregationSources", value.asInstanceOf[js.Any])
    
    inline def setAccountAggregationSourcesUndefined: Self = StObject.set(x, "AccountAggregationSources", js.undefined)
    
    inline def setAccountAggregationSourcesVarargs(value: AccountAggregationSource*): Self = StObject.set(x, "AccountAggregationSources", js.Array(value*))
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationAggregationSource(value: OrganizationAggregationSource): Self = StObject.set(x, "OrganizationAggregationSource", value.asInstanceOf[js.Any])
    
    inline def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "OrganizationAggregationSource", js.undefined)
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
