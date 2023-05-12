package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve the next set of search metrics data.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
  
  /**
    * The Unix timestamp for the beginning and end of the time window for the search metrics data.
    */
  var SnapShotTimeFilter: js.UndefOr[TimeRange] = js.undefined
  
  /**
    * The search metrics data. The data returned depends on the metric type you requested.
    */
  var SnapshotsData: js.UndefOr[SnapshotsDataRecords] = js.undefined
  
  /**
    * The column headers for the search metrics data.
    */
  var SnapshotsDataHeader: js.UndefOr[SnapshotsDataHeaderFields] = js.undefined
}
object GetSnapshotsResponse {
  
  inline def apply(): GetSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSnapshotsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapShotTimeFilter(value: TimeRange): Self = StObject.set(x, "SnapShotTimeFilter", value.asInstanceOf[js.Any])
    
    inline def setSnapShotTimeFilterUndefined: Self = StObject.set(x, "SnapShotTimeFilter", js.undefined)
    
    inline def setSnapshotsData(value: SnapshotsDataRecords): Self = StObject.set(x, "SnapshotsData", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsDataHeader(value: SnapshotsDataHeaderFields): Self = StObject.set(x, "SnapshotsDataHeader", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsDataHeaderUndefined: Self = StObject.set(x, "SnapshotsDataHeader", js.undefined)
    
    inline def setSnapshotsDataHeaderVarargs(value: String*): Self = StObject.set(x, "SnapshotsDataHeader", js.Array(value*))
    
    inline def setSnapshotsDataUndefined: Self = StObject.set(x, "SnapshotsData", js.undefined)
    
    inline def setSnapshotsDataVarargs(value: SnapshotsDataRecord*): Self = StObject.set(x, "SnapshotsData", js.Array(value*))
  }
}
