package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationAggregator extends StObject {
  
  /**
    * Provides a list of source accounts and regions to be aggregated.
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the aggregator.
    */
  var ConfigurationAggregatorArn: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorArn] = js.undefined
  
  /**
    * The name of the aggregator.
    */
  var ConfigurationAggregatorName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorName] = js.undefined
  
  /**
    * Amazon Web Services service that created the configuration aggregator.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The time stamp when the configuration aggregator was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time of the last update.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides an organization and list of regions to be aggregated.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationAggregationSource] = js.undefined
}
object ConfigurationAggregator {
  
  inline def apply(): ConfigurationAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationAggregator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationAggregator] (val x: Self) extends AnyVal {
    
    inline def setAccountAggregationSources(value: AccountAggregationSourceList): Self = StObject.set(x, "AccountAggregationSources", value.asInstanceOf[js.Any])
    
    inline def setAccountAggregationSourcesUndefined: Self = StObject.set(x, "AccountAggregationSources", js.undefined)
    
    inline def setAccountAggregationSourcesVarargs(value: AccountAggregationSource*): Self = StObject.set(x, "AccountAggregationSources", js.Array(value*))
    
    inline def setConfigurationAggregatorArn(value: ConfigurationAggregatorArn): Self = StObject.set(x, "ConfigurationAggregatorArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAggregatorArnUndefined: Self = StObject.set(x, "ConfigurationAggregatorArn", js.undefined)
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAggregatorNameUndefined: Self = StObject.set(x, "ConfigurationAggregatorName", js.undefined)
    
    inline def setCreatedBy(value: StringWithCharLimit256): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setOrganizationAggregationSource(value: OrganizationAggregationSource): Self = StObject.set(x, "OrganizationAggregationSource", value.asInstanceOf[js.Any])
    
    inline def setOrganizationAggregationSourceUndefined: Self = StObject.set(x, "OrganizationAggregationSource", js.undefined)
  }
}
