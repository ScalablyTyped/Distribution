package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvalidationsRequest extends StObject {
  
  /**
    * The distribution's ID.
    */
  var DistributionId: String
  
  /**
    * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches. Because the results are returned in decreasing order from most recent to oldest, the most recent results are on the first page, the second page will contain earlier results, and so on. To get the next page of results, set Marker to the value of the NextMarker from the current page's response. This value is the same as the ID of the last invalidation batch on that page. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of invalidation batches that you want in the response body.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListInvalidationsRequest {
  
  inline def apply(DistributionId: String): ListInvalidationsRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvalidationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInvalidationsRequest] (val x: Self) extends AnyVal {
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
