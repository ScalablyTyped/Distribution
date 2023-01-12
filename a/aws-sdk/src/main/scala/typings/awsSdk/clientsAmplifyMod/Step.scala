package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /**
    *  The URL to the artifact for the execution step. 
    */
  var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined
  
  /**
    *  The context for the current step. Includes a build image if the step is build. 
    */
  var context: js.UndefOr[Context] = js.undefined
  
  /**
    *  The end date and time of the execution step. 
    */
  var endTime: js.Date
  
  /**
    *  The URL to the logs for the execution step. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.undefined
  
  /**
    *  The list of screenshot URLs for the execution step, if relevant. 
    */
  var screenshots: js.UndefOr[Screenshots] = js.undefined
  
  /**
    *  The start date and time of the execution step. 
    */
  var startTime: js.Date
  
  /**
    *  The status of the execution step. 
    */
  var status: JobStatus
  
  /**
    *  The reason for the current step status. 
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
  
  /**
    *  The name of the execution step. 
    */
  var stepName: StepName
  
  /**
    *  The URL to the test artifact for the execution step. 
    */
  var testArtifactsUrl: js.UndefOr[TestArtifactsUrl] = js.undefined
  
  /**
    *  The URL to the test configuration for the execution step. 
    */
  var testConfigUrl: js.UndefOr[TestConfigUrl] = js.undefined
}
object Step {
  
  inline def apply(endTime: js.Date, startTime: js.Date, status: JobStatus, stepName: StepName): Step = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    inline def setArtifactsUrl(value: ArtifactsUrl): Self = StObject.set(x, "artifactsUrl", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUrlUndefined: Self = StObject.set(x, "artifactsUrl", js.undefined)
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setLogUrl(value: LogUrl): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    inline def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    inline def setScreenshots(value: Screenshots): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStepName(value: StepName): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    inline def setTestArtifactsUrl(value: TestArtifactsUrl): Self = StObject.set(x, "testArtifactsUrl", value.asInstanceOf[js.Any])
    
    inline def setTestArtifactsUrlUndefined: Self = StObject.set(x, "testArtifactsUrl", js.undefined)
    
    inline def setTestConfigUrl(value: TestConfigUrl): Self = StObject.set(x, "testConfigUrl", value.asInstanceOf[js.Any])
    
    inline def setTestConfigUrlUndefined: Self = StObject.set(x, "testConfigUrl", js.undefined)
  }
}
