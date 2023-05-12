package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVariantStoresFilter extends StObject {
  
  /**
    * A status to filter on.
    */
  var status: js.UndefOr[StoreStatus] = js.undefined
}
object ListVariantStoresFilter {
  
  inline def apply(): ListVariantStoresFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariantStoresFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVariantStoresFilter] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
