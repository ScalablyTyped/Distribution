package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseStatusType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Durationinseconds extends StObject {
  
  // Not available for COMPLETED phase-type
  var `duration-in-seconds`: js.UndefOr[Double] = js.undefined
  
  var `end-time`: js.UndefOr[String] = js.undefined
  
  var `phase-context`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `phase-status`: js.UndefOr[CodeBuildPhaseStatusType] = js.undefined
  
  // Not available for COMPLETED phase-type
  var `phase-type`: CodeBuildPhaseType
  
  // Not available for COMPLETED phase-type
  var `start-time`: String
}
object Durationinseconds {
  
  inline def apply(`phase-type`: CodeBuildPhaseType, `start-time`: String): Durationinseconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("phase-type")(`phase-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durationinseconds]
  }
  
  extension [Self <: Durationinseconds](x: Self) {
    
    inline def `setDuration-in-seconds`(value: Double): Self = StObject.set(x, "duration-in-seconds", value.asInstanceOf[js.Any])
    
    inline def `setDuration-in-secondsUndefined`: Self = StObject.set(x, "duration-in-seconds", js.undefined)
    
    inline def `setEnd-time`(value: String): Self = StObject.set(x, "end-time", value.asInstanceOf[js.Any])
    
    inline def `setEnd-timeUndefined`: Self = StObject.set(x, "end-time", js.undefined)
    
    inline def `setPhase-context`(value: js.Array[String]): Self = StObject.set(x, "phase-context", value.asInstanceOf[js.Any])
    
    inline def `setPhase-contextUndefined`: Self = StObject.set(x, "phase-context", js.undefined)
    
    inline def `setPhase-contextVarargs`(value: String*): Self = StObject.set(x, "phase-context", js.Array(value :_*))
    
    inline def `setPhase-status`(value: CodeBuildPhaseStatusType): Self = StObject.set(x, "phase-status", value.asInstanceOf[js.Any])
    
    inline def `setPhase-statusUndefined`: Self = StObject.set(x, "phase-status", js.undefined)
    
    inline def `setPhase-type`(value: CodeBuildPhaseType): Self = StObject.set(x, "phase-type", value.asInstanceOf[js.Any])
    
    inline def `setStart-time`(value: String): Self = StObject.set(x, "start-time", value.asInstanceOf[js.Any])
  }
}
