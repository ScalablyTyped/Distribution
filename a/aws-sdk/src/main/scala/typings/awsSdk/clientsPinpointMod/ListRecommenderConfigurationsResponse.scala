package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommenderConfigurationsResponse extends StObject {
  
  /**
    * An array of responses, one for each recommender model configuration that's associated with your Amazon Pinpoint account.
    */
  var Item: ListOfRecommenderConfigurationResponse
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListRecommenderConfigurationsResponse {
  
  inline def apply(Item: ListOfRecommenderConfigurationResponse): ListRecommenderConfigurationsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommenderConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommenderConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ListOfRecommenderConfigurationResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: RecommenderConfigurationResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
