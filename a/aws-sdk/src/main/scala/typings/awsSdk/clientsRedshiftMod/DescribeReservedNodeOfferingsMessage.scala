package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedNodeOfferingsMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeReservedNodeOfferings request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The unique identifier for the offering.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
}
object DescribeReservedNodeOfferingsMessage {
  
  inline def apply(): DescribeReservedNodeOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedNodeOfferingsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedNodeOfferingsMessage] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setReservedNodeOfferingId(value: String): Self = StObject.set(x, "ReservedNodeOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeOfferingIdUndefined: Self = StObject.set(x, "ReservedNodeOfferingId", js.undefined)
  }
}
