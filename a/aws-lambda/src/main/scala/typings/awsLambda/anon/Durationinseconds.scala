package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseStatusType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Durationinseconds extends js.Object {
  
   // Not available for COMPLETED phase-type
  var `duration-in-seconds`: js.UndefOr[Double] = js.native
  
  var `end-time`: js.UndefOr[String] = js.native
  
  var `phase-context`: js.UndefOr[js.Array[String]] = js.native
  
  var `phase-status`: js.UndefOr[CodeBuildPhaseStatusType] = js.native
  
   // Not available for COMPLETED phase-type
  var `phase-type`: CodeBuildPhaseType = js.native
  
   // Not available for COMPLETED phase-type
  var `start-time`: String = js.native
}
object Durationinseconds {
  
  @scala.inline
  def apply(`phase-type`: CodeBuildPhaseType, `start-time`: String): Durationinseconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("phase-type")(`phase-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durationinseconds]
  }
  
  @scala.inline
  implicit class DurationinsecondsOps[Self <: Durationinseconds] (val x: Self) extends AnyVal {
    
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
    def `setPhase-type`(value: CodeBuildPhaseType): Self = this.set("phase-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-time`(value: String): Self = this.set("start-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDuration-in-seconds`(value: Double): Self = this.set("duration-in-seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDuration-in-seconds`: Self = this.set("duration-in-seconds", js.undefined)
    
    @scala.inline
    def `setEnd-time`(value: String): Self = this.set("end-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEnd-time`: Self = this.set("end-time", js.undefined)
    
    @scala.inline
    def `setPhase-contextVarargs`(value: String*): Self = this.set("phase-context", js.Array(value :_*))
    
    @scala.inline
    def `setPhase-context`(value: js.Array[String]): Self = this.set("phase-context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePhase-context`: Self = this.set("phase-context", js.undefined)
    
    @scala.inline
    def `setPhase-status`(value: CodeBuildPhaseStatusType): Self = this.set("phase-status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePhase-status`: Self = this.set("phase-status", js.undefined)
  }
}
