package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSharesMessage extends StObject {
  
  /**
    * The identifier of the datashare to describe details of.
    */
  var DataShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeDataShares request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value. 
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeDataSharesMessage {
  
  inline def apply(): DescribeDataSharesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSharesMessage]
  }
  
  extension [Self <: DescribeDataSharesMessage](x: Self) {
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
    
    inline def setDataShareArnUndefined: Self = StObject.set(x, "DataShareArn", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
