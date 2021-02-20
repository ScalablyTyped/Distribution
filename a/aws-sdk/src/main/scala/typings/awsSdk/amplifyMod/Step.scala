package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends StObject {
  
  /**
    *  The URL to the artifact for the execution step. 
    */
  var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.native
  
  /**
    *  The context for the current step. Includes a build image if the step is build. 
    */
  var context: js.UndefOr[Context] = js.native
  
  /**
    *  The end date and time of the execution step. 
    */
  var endTime: EndTime = js.native
  
  /**
    *  The URL to the logs for the execution step. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.native
  
  /**
    *  The list of screenshot URLs for the execution step, if relevant. 
    */
  var screenshots: js.UndefOr[Screenshots] = js.native
  
  /**
    *  The start date and time of the execution step. 
    */
  var startTime: StartTime = js.native
  
  /**
    *  The status of the execution step. 
    */
  var status: JobStatus = js.native
  
  /**
    *  The reason for the current step status. 
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
  
  /**
    *  The name of the execution step. 
    */
  var stepName: StepName = js.native
  
  /**
    *  The URL to the test artifact for the execution step. 
    */
  var testArtifactsUrl: js.UndefOr[TestArtifactsUrl] = js.native
  
  /**
    *  The URL to the test configuration for the execution step. 
    */
  var testConfigUrl: js.UndefOr[TestConfigUrl] = js.native
}
object Step {
  
  @scala.inline
  def apply(endTime: EndTime, startTime: StartTime, status: JobStatus, stepName: StepName): Step = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactsUrl(value: ArtifactsUrl): Self = StObject.set(x, "artifactsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUrlUndefined: Self = StObject.set(x, "artifactsUrl", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEndTime(value: EndTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUrl(value: LogUrl): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
    
    @scala.inline
    def setScreenshots(value: Screenshots): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStepName(value: StepName): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestArtifactsUrl(value: TestArtifactsUrl): Self = StObject.set(x, "testArtifactsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestArtifactsUrlUndefined: Self = StObject.set(x, "testArtifactsUrl", js.undefined)
    
    @scala.inline
    def setTestConfigUrl(value: TestConfigUrl): Self = StObject.set(x, "testConfigUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestConfigUrlUndefined: Self = StObject.set(x, "testConfigUrl", js.undefined)
  }
}
