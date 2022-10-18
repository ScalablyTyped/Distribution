package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRetentionConfigurationsResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
  
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined
}
object DescribeRetentionConfigurationsResponse {
  
  inline def apply(): DescribeRetentionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRetentionConfigurationsResponse]
  }
  
  extension [Self <: DescribeRetentionConfigurationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRetentionConfigurations(value: RetentionConfigurationList): Self = StObject.set(x, "RetentionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setRetentionConfigurationsUndefined: Self = StObject.set(x, "RetentionConfigurations", js.undefined)
    
    inline def setRetentionConfigurationsVarargs(value: RetentionConfiguration*): Self = StObject.set(x, "RetentionConfigurations", js.Array(value*))
  }
}
