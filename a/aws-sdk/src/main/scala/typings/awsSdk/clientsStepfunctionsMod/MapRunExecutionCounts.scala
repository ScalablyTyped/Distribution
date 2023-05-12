package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapRunExecutionCounts extends StObject {
  
  /**
    * The total number of child workflow executions that were started by a Map Run and were running, but were either stopped by the user or by Step Functions because the Map Run failed. 
    */
  var aborted: UnsignedLong
  
  /**
    * The total number of child workflow executions that were started by a Map Run, but have failed.
    */
  var failed: UnsignedLong
  
  /**
    * The total number of child workflow executions that were started by a Map Run, but haven't started executing yet. 
    */
  var pending: UnsignedLong
  
  /**
    * Returns the count of child workflow executions whose results were written by ResultWriter. For more information, see ResultWriter in the Step Functions Developer Guide.
    */
  var resultsWritten: UnsignedLong
  
  /**
    * The total number of child workflow executions that were started by a Map Run and are currently in-progress.
    */
  var running: UnsignedLong
  
  /**
    * The total number of child workflow executions that were started by a Map Run and have completed successfully.
    */
  var succeeded: UnsignedLong
  
  /**
    * The total number of child workflow executions that were started by a Map Run and have timed out.
    */
  var timedOut: UnsignedLong
  
  /**
    * The total number of child workflow executions that were started by a Map Run.
    */
  var total: UnsignedLong
}
object MapRunExecutionCounts {
  
  inline def apply(
    aborted: UnsignedLong,
    failed: UnsignedLong,
    pending: UnsignedLong,
    resultsWritten: UnsignedLong,
    running: UnsignedLong,
    succeeded: UnsignedLong,
    timedOut: UnsignedLong,
    total: UnsignedLong
  ): MapRunExecutionCounts = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], resultsWritten = resultsWritten.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRunExecutionCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapRunExecutionCounts] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: UnsignedLong): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: UnsignedLong): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setPending(value: UnsignedLong): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setResultsWritten(value: UnsignedLong): Self = StObject.set(x, "resultsWritten", value.asInstanceOf[js.Any])
    
    inline def setRunning(value: UnsignedLong): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: UnsignedLong): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setTimedOut(value: UnsignedLong): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: UnsignedLong): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
