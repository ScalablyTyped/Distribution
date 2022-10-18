package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentConfigurationRecommendationResponse extends StObject {
  
  /**
    * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ComponentConfiguration] = js.undefined
}
object DescribeComponentConfigurationRecommendationResponse {
  
  inline def apply(): DescribeComponentConfigurationRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
  }
  
  extension [Self <: DescribeComponentConfigurationRecommendationResponse](x: Self) {
    
    inline def setComponentConfiguration(value: ComponentConfiguration): Self = StObject.set(x, "ComponentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigurationUndefined: Self = StObject.set(x, "ComponentConfiguration", js.undefined)
  }
}
