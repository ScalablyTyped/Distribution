package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByCachePolicyIdRequest extends StObject {
  
  /**
    * The ID of the cache policy whose associated distribution IDs you want to list.
    */
  var CachePolicyId: String
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this field's value to the value of NextMarker from the current page's response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of distribution IDs that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListDistributionsByCachePolicyIdRequest {
  
  inline def apply(CachePolicyId: String): ListDistributionsByCachePolicyIdRequest = {
    val __obj = js.Dynamic.literal(CachePolicyId = CachePolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByCachePolicyIdRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDistributionsByCachePolicyIdRequest] (val x: Self) extends AnyVal {
    
    inline def setCachePolicyId(value: String): Self = StObject.set(x, "CachePolicyId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
