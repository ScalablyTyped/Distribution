package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationAggregatorsResponse extends StObject {
  
  /**
    * Returns a ConfigurationAggregators object.
    */
  var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeConfigurationAggregatorsResponse {
  
  inline def apply(): DescribeConfigurationAggregatorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorsResponse]
  }
  
  extension [Self <: DescribeConfigurationAggregatorsResponse](x: Self) {
    
    inline def setConfigurationAggregators(value: ConfigurationAggregatorList): Self = StObject.set(x, "ConfigurationAggregators", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAggregatorsUndefined: Self = StObject.set(x, "ConfigurationAggregators", js.undefined)
    
    inline def setConfigurationAggregatorsVarargs(value: ConfigurationAggregator*): Self = StObject.set(x, "ConfigurationAggregators", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
