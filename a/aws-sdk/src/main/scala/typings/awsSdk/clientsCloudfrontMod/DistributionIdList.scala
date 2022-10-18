package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionIdList extends StObject {
  
  /**
    * A flag that indicates whether more distribution IDs remain to be listed. If your results were truncated, you can make a subsequent request using the Marker request field to retrieve more distribution IDs in the list.
    */
  var IsTruncated: Boolean
  
  /**
    * Contains the distribution IDs in the list.
    */
  var Items: js.UndefOr[DistributionIdListSummary] = js.undefined
  
  /**
    * The value provided in the Marker request field.
    */
  var Marker: String
  
  /**
    * The maximum number of distribution IDs requested.
    */
  var MaxItems: integer
  
  /**
    * Contains the value that you should use in the Marker field of a subsequent request to continue listing distribution IDs where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of distribution IDs returned in the response.
    */
  var Quantity: integer
}
object DistributionIdList {
  
  inline def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): DistributionIdList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionIdList]
  }
  
  extension [Self <: DistributionIdList](x: Self) {
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setItems(value: DistributionIdListSummary): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
