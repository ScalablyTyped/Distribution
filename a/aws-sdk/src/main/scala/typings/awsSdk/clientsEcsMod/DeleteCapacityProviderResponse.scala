package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCapacityProviderResponse extends StObject {
  
  /**
    * The details of the capacity provider.
    */
  var capacityProvider: js.UndefOr[CapacityProvider] = js.undefined
}
object DeleteCapacityProviderResponse {
  
  inline def apply(): DeleteCapacityProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCapacityProviderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCapacityProviderResponse] (val x: Self) extends AnyVal {
    
    inline def setCapacityProvider(value: CapacityProvider): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderUndefined: Self = StObject.set(x, "capacityProvider", js.undefined)
  }
}
