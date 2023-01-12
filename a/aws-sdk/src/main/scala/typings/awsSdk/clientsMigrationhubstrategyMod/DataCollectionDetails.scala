package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCollectionDetails extends StObject {
  
  /**
    *  The time the assessment completes. 
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The number of failed servers in the assessment. 
    */
  var failed: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of servers with the assessment status IN_PROGESS. 
    */
  var inProgress: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The total number of servers in the assessment. 
    */
  var servers: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The start time of assessment. 
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of the assessment. 
    */
  var status: js.UndefOr[AssessmentStatus] = js.undefined
  
  /**
    *  The number of successful servers in the assessment. 
    */
  var success: js.UndefOr[Integer] = js.undefined
}
object DataCollectionDetails {
  
  inline def apply(): DataCollectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollectionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCollectionDetails] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setFailed(value: Integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setInProgress(value: Integer): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setInProgressUndefined: Self = StObject.set(x, "inProgress", js.undefined)
    
    inline def setServers(value: Integer): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: AssessmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuccess(value: Integer): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
