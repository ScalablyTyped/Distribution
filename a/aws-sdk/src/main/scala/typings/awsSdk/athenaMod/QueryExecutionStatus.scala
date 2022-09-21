package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecutionStatus extends StObject {
  
  /**
    * Provides information about an Athena query error.
    */
  var AthenaError: js.UndefOr[typings.awsSdk.athenaMod.AthenaError] = js.undefined
  
  /**
    * The date and time that the query completed.
    */
  var CompletionDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of query execution. QUEUED indicates that the query has been submitted to the service, and Athena will execute the query as soon as resources are available. RUNNING indicates that the query is in execution phase. SUCCEEDED indicates that the query completed without errors. FAILED indicates that the query experienced an error and did not complete processing. CANCELLED indicates that a user input interrupted query execution.  Athena automatically retries your queries in cases of certain transient errors. As a result, you may see the query state transition from RUNNING or FAILED to QUEUED.  
    */
  var State: js.UndefOr[QueryExecutionState] = js.undefined
  
  /**
    * Further detail about the status of the query.
    */
  var StateChangeReason: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the query was submitted.
    */
  var SubmissionDateTime: js.UndefOr[js.Date] = js.undefined
}
object QueryExecutionStatus {
  
  inline def apply(): QueryExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionStatus]
  }
  
  extension [Self <: QueryExecutionStatus](x: Self) {
    
    inline def setAthenaError(value: AthenaError): Self = StObject.set(x, "AthenaError", value.asInstanceOf[js.Any])
    
    inline def setAthenaErrorUndefined: Self = StObject.set(x, "AthenaError", js.undefined)
    
    inline def setCompletionDateTime(value: js.Date): Self = StObject.set(x, "CompletionDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateTimeUndefined: Self = StObject.set(x, "CompletionDateTime", js.undefined)
    
    inline def setState(value: QueryExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: String): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubmissionDateTime(value: js.Date): Self = StObject.set(x, "SubmissionDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubmissionDateTimeUndefined: Self = StObject.set(x, "SubmissionDateTime", js.undefined)
  }
}
