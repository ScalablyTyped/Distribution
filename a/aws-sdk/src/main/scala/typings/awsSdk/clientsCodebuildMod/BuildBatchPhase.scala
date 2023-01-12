package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBatchPhase extends StObject {
  
  /**
    * Additional information about the batch build phase. Especially to help troubleshoot a failed batch build.
    */
  var contexts: js.UndefOr[PhaseContexts] = js.undefined
  
  /**
    * How long, in seconds, between the starting and ending times of the batch build's phase.
    */
  var durationInSeconds: js.UndefOr[WrapperLong] = js.undefined
  
  /**
    * When the batch build phase ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the batch build phase. Valid values include:  FAILED  The build phase failed.  FAULT  The build phase faulted.  IN_PROGRESS  The build phase is still in progress.  STOPPED  The build phase stopped.  SUCCEEDED  The build phase succeeded.  TIMED_OUT  The build phase timed out.  
    */
  var phaseStatus: js.UndefOr[StatusType] = js.undefined
  
  /**
    * The name of the batch build phase. Valid values include:  COMBINE_ARTIFACTS  Build output artifacts are being combined and uploaded to the output location.  DOWNLOAD_BATCHSPEC  The batch build specification is being downloaded.  FAILED  One or more of the builds failed.  IN_PROGRESS  The batch build is in progress.  STOPPED  The batch build was stopped.  SUBMITTED  The btach build has been submitted.  SUCCEEDED  The batch build succeeded.  
    */
  var phaseType: js.UndefOr[BuildBatchPhaseType] = js.undefined
  
  /**
    * When the batch build phase started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object BuildBatchPhase {
  
  inline def apply(): BuildBatchPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatchPhase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBatchPhase] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: PhaseContexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: PhaseContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setDurationInSeconds(value: WrapperLong): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setPhaseStatus(value: StatusType): Self = StObject.set(x, "phaseStatus", value.asInstanceOf[js.Any])
    
    inline def setPhaseStatusUndefined: Self = StObject.set(x, "phaseStatus", js.undefined)
    
    inline def setPhaseType(value: BuildBatchPhaseType): Self = StObject.set(x, "phaseType", value.asInstanceOf[js.Any])
    
    inline def setPhaseTypeUndefined: Self = StObject.set(x, "phaseType", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
