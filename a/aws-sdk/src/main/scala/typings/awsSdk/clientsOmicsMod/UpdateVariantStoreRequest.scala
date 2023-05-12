package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVariantStoreRequest extends StObject {
  
  /**
    * A description for the store.
    */
  var description: js.UndefOr[StoreDescription] = js.undefined
  
  /**
    * A name for the store.
    */
  var name: String
}
object UpdateVariantStoreRequest {
  
  inline def apply(name: String): UpdateVariantStoreRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVariantStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVariantStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: StoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
