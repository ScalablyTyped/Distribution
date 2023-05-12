package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByResponseHeadersPolicyIdRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this field's value to the value of NextMarker from the current page's response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of distribution IDs that you want to get in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the response headers policy whose associated distribution IDs you want to list.
    */
  var ResponseHeadersPolicyId: String
}
object ListDistributionsByResponseHeadersPolicyIdRequest {
  
  inline def apply(ResponseHeadersPolicyId: String): ListDistributionsByResponseHeadersPolicyIdRequest = {
    val __obj = js.Dynamic.literal(ResponseHeadersPolicyId = ResponseHeadersPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByResponseHeadersPolicyIdRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDistributionsByResponseHeadersPolicyIdRequest] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setResponseHeadersPolicyId(value: String): Self = StObject.set(x, "ResponseHeadersPolicyId", value.asInstanceOf[js.Any])
  }
}
