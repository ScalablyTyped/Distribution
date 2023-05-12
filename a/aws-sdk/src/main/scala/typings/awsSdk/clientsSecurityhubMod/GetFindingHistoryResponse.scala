package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingHistoryResponse extends StObject {
  
  /**
    *  A token for pagination purposes. Provide this token in the subsequent request to GetFindingsHistory to get up to an additional 100 results of history for the same finding that you specified in your initial request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  A list of events that altered the specified finding during the specified time period. 
    */
  var Records: js.UndefOr[FindingHistoryRecordList] = js.undefined
}
object GetFindingHistoryResponse {
  
  inline def apply(): GetFindingHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingHistoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingHistoryResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecords(value: FindingHistoryRecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    inline def setRecordsVarargs(value: FindingHistoryRecord*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
