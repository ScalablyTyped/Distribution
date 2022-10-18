package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIncidentRecordsOutput extends StObject {
  
  /**
    * The details of each listed incident record.
    */
  var incidentRecordSummaries: IncidentRecordSummaryList
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListIncidentRecordsOutput {
  
  inline def apply(incidentRecordSummaries: IncidentRecordSummaryList): ListIncidentRecordsOutput = {
    val __obj = js.Dynamic.literal(incidentRecordSummaries = incidentRecordSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIncidentRecordsOutput]
  }
  
  extension [Self <: ListIncidentRecordsOutput](x: Self) {
    
    inline def setIncidentRecordSummaries(value: IncidentRecordSummaryList): Self = StObject.set(x, "incidentRecordSummaries", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordSummariesVarargs(value: IncidentRecordSummary*): Self = StObject.set(x, "incidentRecordSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
