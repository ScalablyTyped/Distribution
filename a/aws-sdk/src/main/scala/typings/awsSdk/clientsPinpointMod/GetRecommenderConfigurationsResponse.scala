package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommenderConfigurationsResponse extends StObject {
  
  var ListRecommenderConfigurationsResponse: typings.awsSdk.clientsPinpointMod.ListRecommenderConfigurationsResponse
}
object GetRecommenderConfigurationsResponse {
  
  inline def apply(ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse): GetRecommenderConfigurationsResponse = {
    val __obj = js.Dynamic.literal(ListRecommenderConfigurationsResponse = ListRecommenderConfigurationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommenderConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRecommenderConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setListRecommenderConfigurationsResponse(value: ListRecommenderConfigurationsResponse): Self = StObject.set(x, "ListRecommenderConfigurationsResponse", value.asInstanceOf[js.Any])
  }
}
