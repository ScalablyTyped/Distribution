package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseStatusType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Durationinseconds extends StObject {
  
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
  implicit class DurationinsecondsMutableBuilder[Self <: Durationinseconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setDuration-in-seconds`(value: Double): Self = StObject.set(x, "duration-in-seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDuration-in-secondsUndefined`: Self = StObject.set(x, "duration-in-seconds", js.undefined)
    
    @scala.inline
    def `setEnd-time`(value: String): Self = StObject.set(x, "end-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnd-timeUndefined`: Self = StObject.set(x, "end-time", js.undefined)
    
    @scala.inline
    def `setPhase-context`(value: js.Array[String]): Self = StObject.set(x, "phase-context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPhase-contextUndefined`: Self = StObject.set(x, "phase-context", js.undefined)
    
    @scala.inline
    def `setPhase-contextVarargs`(value: String*): Self = StObject.set(x, "phase-context", js.Array(value :_*))
    
    @scala.inline
    def `setPhase-status`(value: CodeBuildPhaseStatusType): Self = StObject.set(x, "phase-status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPhase-statusUndefined`: Self = StObject.set(x, "phase-status", js.undefined)
    
    @scala.inline
    def `setPhase-type`(value: CodeBuildPhaseType): Self = StObject.set(x, "phase-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-time`(value: String): Self = StObject.set(x, "start-time", value.asInstanceOf[js.Any])
  }
}
