package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDataSetsResponse extends StObject {
  
  /**
    * A DataSetSummaries object that returns a summary of a dataset.
    */
  var DataSetSummaries: js.UndefOr[DataSetSummaryList] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object SearchDataSetsResponse {
  
  inline def apply(): SearchDataSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDataSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchDataSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataSetSummaries(value: DataSetSummaryList): Self = StObject.set(x, "DataSetSummaries", value.asInstanceOf[js.Any])
    
    inline def setDataSetSummariesUndefined: Self = StObject.set(x, "DataSetSummaries", js.undefined)
    
    inline def setDataSetSummariesVarargs(value: DataSetSummary*): Self = StObject.set(x, "DataSetSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
