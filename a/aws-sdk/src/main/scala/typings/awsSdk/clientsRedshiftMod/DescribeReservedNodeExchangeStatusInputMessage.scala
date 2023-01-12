package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedNodeExchangeStatusInputMessage extends StObject {
  
  /**
    * An optional pagination token provided by a previous DescribeReservedNodeExchangeStatus request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a Marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the reserved-node exchange request.
    */
  var ReservedNodeExchangeRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the source reserved node in a reserved-node exchange request.
    */
  var ReservedNodeId: js.UndefOr[String] = js.undefined
}
object DescribeReservedNodeExchangeStatusInputMessage {
  
  inline def apply(): DescribeReservedNodeExchangeStatusInputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedNodeExchangeStatusInputMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedNodeExchangeStatusInputMessage] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setReservedNodeExchangeRequestId(value: String): Self = StObject.set(x, "ReservedNodeExchangeRequestId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeExchangeRequestIdUndefined: Self = StObject.set(x, "ReservedNodeExchangeRequestId", js.undefined)
    
    inline def setReservedNodeId(value: String): Self = StObject.set(x, "ReservedNodeId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeIdUndefined: Self = StObject.set(x, "ReservedNodeId", js.undefined)
  }
}
