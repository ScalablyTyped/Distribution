package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConflictingAliasesList extends StObject {
  
  /**
    * Contains the conflicting aliases in the list.
    */
  var Items: js.UndefOr[ConflictingAliases] = js.undefined
  
  /**
    * The maximum number of conflicting aliases requested.
    */
  var MaxItems: js.UndefOr[integer] = js.undefined
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing conflicting aliases where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of conflicting aliases returned in the response.
    */
  var Quantity: js.UndefOr[integer] = js.undefined
}
object ConflictingAliasesList {
  
  inline def apply(): ConflictingAliasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictingAliasesList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConflictingAliasesList] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ConflictingAliases): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ConflictingAlias*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
  }
}
