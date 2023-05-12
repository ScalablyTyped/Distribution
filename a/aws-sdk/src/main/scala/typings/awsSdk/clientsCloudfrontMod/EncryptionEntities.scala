package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionEntities extends StObject {
  
  /**
    * An array of field patterns in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[EncryptionEntityList] = js.undefined
  
  /**
    * Number of field pattern items in a field-level encryption content type-profile mapping.
    */
  var Quantity: integer
}
object EncryptionEntities {
  
  inline def apply(Quantity: integer): EncryptionEntities = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionEntities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionEntities] (val x: Self) extends AnyVal {
    
    inline def setItems(value: EncryptionEntityList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: EncryptionEntity*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
