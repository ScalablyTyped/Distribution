package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidationList extends StObject {
  
  /**
    * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more invalidation batches in the list.
    */
  var IsTruncated: Boolean
  
  /**
    * A complex type that contains one InvalidationSummary element for each invalidation batch created by the current Amazon Web Services account.
    */
  var Items: js.UndefOr[InvalidationSummaryList] = js.undefined
  
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: String
  
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: integer
  
  /**
    * If IsTruncated is true, this element is present and contains the value that you can use for the Marker request parameter to continue listing your invalidation batches where they left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of invalidation batches that were created by the current Amazon Web Services account. 
    */
  var Quantity: integer
}
object InvalidationList {
  
  inline def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): InvalidationList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidationList] (val x: Self) extends AnyVal {
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setItems(value: InvalidationSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: InvalidationSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
