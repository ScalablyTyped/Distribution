package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByKeyGroupRequest extends StObject {
  
  /**
    * The ID of the key group whose associated distribution IDs you are listing.
    */
  var KeyGroupId: String
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of distribution IDs that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListDistributionsByKeyGroupRequest {
  
  inline def apply(KeyGroupId: String): ListDistributionsByKeyGroupRequest = {
    val __obj = js.Dynamic.literal(KeyGroupId = KeyGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByKeyGroupRequest]
  }
  
  extension [Self <: ListDistributionsByKeyGroupRequest](x: Self) {
    
    inline def setKeyGroupId(value: String): Self = StObject.set(x, "KeyGroupId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
