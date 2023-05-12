package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVariantStoreRequest extends StObject {
  
  /**
    * The store's name.
    */
  var name: String
}
object GetVariantStoreRequest {
  
  inline def apply(name: String): GetVariantStoreRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVariantStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVariantStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
