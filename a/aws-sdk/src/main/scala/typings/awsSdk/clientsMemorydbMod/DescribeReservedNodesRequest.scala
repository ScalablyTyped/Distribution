package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedNodesRequest extends StObject {
  
  /**
    * The duration filter value, specified in years or seconds. Use this parameter to show only reservations for this duration.
    */
  var Duration: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The node type filter value. Use this parameter to show only those reservations matching the specified node type. For more information, see Supported node types.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The offering type filter value. Use this parameter to show only the available offerings matching the specified offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  
  /**
    * The reserved node identifier filter value. Use this parameter to show only the reservation that matches the specified reservation ID.
    */
  var ReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * The offering identifier filter value. Use this parameter to show only purchased reservations matching the specified offering identifier.
    */
  var ReservedNodesOfferingId: js.UndefOr[String] = js.undefined
}
object DescribeReservedNodesRequest {
  
  inline def apply(): DescribeReservedNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedNodesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedNodesRequest] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    inline def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    inline def setReservationId(value: String): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "ReservationId", js.undefined)
    
    inline def setReservedNodesOfferingId(value: String): Self = StObject.set(x, "ReservedNodesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodesOfferingIdUndefined: Self = StObject.set(x, "ReservedNodesOfferingId", js.undefined)
  }
}
