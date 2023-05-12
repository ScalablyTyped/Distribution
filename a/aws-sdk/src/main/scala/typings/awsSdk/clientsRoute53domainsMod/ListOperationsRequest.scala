package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsRequest extends StObject {
  
  /**
    * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    *  The sort type for returned values. 
    */
  var SortBy: js.UndefOr[ListOperationsSortAttributeName] = js.undefined
  
  /**
    *  The sort order ofr returned values, either ascending or descending. 
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.SortOrder] = js.undefined
  
  /**
    *  The status of the operations. 
    */
  var Status: js.UndefOr[OperationStatusList] = js.undefined
  
  /**
    * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var SubmittedSince: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  An arrays of the domains operation types. 
    */
  var Type: js.UndefOr[OperationTypeList] = js.undefined
}
object ListOperationsRequest {
  
  inline def apply(): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOperationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setSortBy(value: ListOperationsSortAttributeName): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatus(value: OperationStatusList): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStatusVarargs(value: OperationStatus*): Self = StObject.set(x, "Status", js.Array(value*))
    
    inline def setSubmittedSince(value: js.Date): Self = StObject.set(x, "SubmittedSince", value.asInstanceOf[js.Any])
    
    inline def setSubmittedSinceUndefined: Self = StObject.set(x, "SubmittedSince", js.undefined)
    
    inline def setType(value: OperationTypeList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setTypeVarargs(value: OperationType*): Self = StObject.set(x, "Type", js.Array(value*))
  }
}
