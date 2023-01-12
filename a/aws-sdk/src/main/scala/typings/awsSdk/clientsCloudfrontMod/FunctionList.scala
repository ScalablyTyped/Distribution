package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionList extends StObject {
  
  /**
    * Contains the functions in the list.
    */
  var Items: js.UndefOr[FunctionSummaryList] = js.undefined
  
  /**
    * The maximum number of functions requested.
    */
  var MaxItems: integer
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing functions where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of functions returned in the response.
    */
  var Quantity: integer
}
object FunctionList {
  
  inline def apply(MaxItems: integer, Quantity: integer): FunctionList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionList] (val x: Self) extends AnyVal {
    
    inline def setItems(value: FunctionSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: FunctionSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
