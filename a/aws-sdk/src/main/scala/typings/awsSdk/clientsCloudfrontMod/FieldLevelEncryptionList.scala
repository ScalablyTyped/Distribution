package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLevelEncryptionList extends StObject {
  
  /**
    * An array of field-level encryption items.
    */
  var Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.undefined
  
  /**
    * The maximum number of elements you want in the response body. 
    */
  var MaxItems: integer
  
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your configurations where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of field-level encryption items.
    */
  var Quantity: integer
}
object FieldLevelEncryptionList {
  
  inline def apply(MaxItems: integer, Quantity: integer): FieldLevelEncryptionList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionList]
  }
  
  extension [Self <: FieldLevelEncryptionList](x: Self) {
    
    inline def setItems(value: FieldLevelEncryptionSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: FieldLevelEncryptionSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
