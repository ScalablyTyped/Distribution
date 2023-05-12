package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnotationStoresFilter extends StObject {
  
  /**
    * A status to filter on.
    */
  var status: js.UndefOr[StoreStatus] = js.undefined
}
object ListAnnotationStoresFilter {
  
  inline def apply(): ListAnnotationStoresFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnotationStoresFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnnotationStoresFilter] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
