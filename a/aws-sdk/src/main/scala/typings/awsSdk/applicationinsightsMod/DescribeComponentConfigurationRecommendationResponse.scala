package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentConfigurationRecommendationResponse extends StObject {
  
  /**
    * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.undefined
}
object DescribeComponentConfigurationRecommendationResponse {
  
  @scala.inline
  def apply(): DescribeComponentConfigurationRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
  }
  
  @scala.inline
  implicit class DescribeComponentConfigurationRecommendationResponseMutableBuilder[Self <: DescribeComponentConfigurationRecommendationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentConfiguration(value: ComponentConfiguration): Self = StObject.set(x, "ComponentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentConfigurationUndefined: Self = StObject.set(x, "ComponentConfiguration", js.undefined)
  }
}
