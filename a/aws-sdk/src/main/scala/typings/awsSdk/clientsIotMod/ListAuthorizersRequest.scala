package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuthorizersRequest extends StObject {
  
  /**
    * Return the list of authorizers in ascending alphabetical order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The status of the list authorizers request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
}
object ListAuthorizersRequest {
  
  inline def apply(): ListAuthorizersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizersRequest]
  }
  
  extension [Self <: ListAuthorizersRequest](x: Self) {
    
    inline def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    inline def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setStatus(value: AuthorizerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
