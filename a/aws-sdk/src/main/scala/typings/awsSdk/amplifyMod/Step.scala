package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends js.Object {
  
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
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: EndTime): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: StartTime): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepName(value: StepName): Self = this.set("stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUrl(value: ArtifactsUrl): Self = this.set("artifactsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactsUrl: Self = this.set("artifactsUrl", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setLogUrl(value: LogUrl): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUrl: Self = this.set("logUrl", js.undefined)
    
    @scala.inline
    def setScreenshots(value: Screenshots): Self = this.set("screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshots: Self = this.set("screenshots", js.undefined)
    
    @scala.inline
    def setStatusReason(value: StatusReason): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    
    @scala.inline
    def setTestArtifactsUrl(value: TestArtifactsUrl): Self = this.set("testArtifactsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestArtifactsUrl: Self = this.set("testArtifactsUrl", js.undefined)
    
    @scala.inline
    def setTestConfigUrl(value: TestConfigUrl): Self = this.set("testConfigUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestConfigUrl: Self = this.set("testConfigUrl", js.undefined)
  }
}
